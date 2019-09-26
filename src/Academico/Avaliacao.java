package Academico;

public class Avaliacao {
    private float nota;
    private float peso;
    private Matricula matricula;
    private Professor professor;

    public Avaliacao(float nota, float peso, Matricula matricula, Professor professor) {
        this.nota = nota;
        this.peso = peso;
        this.matricula = matricula;
        this.professor = professor;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nota=" + nota +
                ", peso=" + peso +
                ", matricula=" + matricula +
                ", professor=" + professor +
                '}';
    }
}
