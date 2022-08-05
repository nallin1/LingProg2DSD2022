package controller;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {

    private ArrayList<Aluno> listaAluno;

    public AlunoController() {
        listaAluno = new ArrayList<>();
    }

    public void cadastrarAluno(int ra, String nome) {
        Aluno al = new Aluno(ra, nome);
        listaAluno.add(al);
    }

    public ArrayList<Aluno> buscarTodosAlunos() {
        return listaAluno;
    }
    /*
    public Aluno buscarAluno(int ra) {
        return aluno;
    }
    */
}
