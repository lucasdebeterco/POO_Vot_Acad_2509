package Academico;

import java.util.ArrayList;
import java.util.List;

public class Frequencia {
    private String dataHora;
    private int aulas;
    private int faltas;
    private List<Matricula> matriculas = new ArrayList<>();
    private Professor professor;

    public Frequencia(String dataHora, int aulas, int faltas, List<Matricula> matriculas, Professor professor) {
        this.dataHora = dataHora;
        this.aulas = aulas;
        this.faltas = faltas;
        this.matriculas = matriculas;
        this.professor = professor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Frequencia{" +
                "dataHora='" + dataHora + '\'' +
                ", aulas=" + aulas +
                ", faltas=" + faltas +
                ", matriculas=" + matriculas +
                ", professor=" + professor +
                '}';
    }
}
