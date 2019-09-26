package Academico;

public class Fase {
    private int semestre;
    private Curso curso;

    public Fase(int semestre, Curso curso) {
        this.semestre = semestre;
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Fase{" +
                "semestre=" + semestre +
                ", curso=" + curso +
                '}';
    }
}
