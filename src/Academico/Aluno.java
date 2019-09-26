package Academico;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome, List<Curso> cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
