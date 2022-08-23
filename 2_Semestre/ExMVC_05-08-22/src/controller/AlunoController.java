package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoController {

    private ArrayList<Aluno> listaAluno;

    public AlunoController() {
        listaAluno = new ArrayList<>();
    }

    public void cadastrarAluno(int ra, String nome) throws SQLException {
        Aluno a = new Aluno(ra, nome);
        //listaAluno.add(al);
        AlunoDAO aldao = new AlunoDAO();
        aldao.inserirAluno(a);
    }

    public ArrayList<Aluno> buscarTodosAlunos() {
        return listaAluno;
    }
    
    public void excluirAluno(int ra) throws SQLException {
        AlunoDAO alDao = new  AlunoDAO();
        alDao.excluir(ra);
    }
    /*
    public Aluno buscarAluno(int ra) {
        return aluno;
    }
    */
}
