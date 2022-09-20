/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import util.HibernateUtil;


/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Aluno al1 = new Aluno(1234, "Maria");
        Aluno al2 = new Aluno(4567,"Jose");
        Aluno al3 = new Aluno(8900,"Marcelo");
        session.save(al1);
        session.save(al2);
        session.save(al3);
        
        Professor prof1 = new Professor (1111,"Tania");
        Professor prof2 = new Professor (2222,"Barreto");
        session.save(prof1);
        session.save(prof2);
       
        session.getTransaction().commit();
       
        String hql = "from Aluno where id>1500";
        Query query = session.createQuery(hql);
        List <Aluno> listaAL = query.list();
        for (Aluno a: listaAL) {
            System.out.println("\n\n");
            System.out.println("NOME: " + a.getNome());
            System.out.println("RA: " + a.getRa());
            System.out.println("\n");
        }
        
        session.close();
        HibernateUtil.shutdown();        
    }
}
