package Academico;

public class Matricula {
    private int numero;
    private DisciplinaLecionada disciplinaLecionada;
    private Aluno aluno;

    public Matricula(int numero, DisciplinaLecionada disciplinaLecionada, Aluno aluno) {
        this.numero = numero;
        this.disciplinaLecionada = disciplinaLecionada;
        this.aluno = aluno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public DisciplinaLecionada getDisciplinaLecionada() {
        return disciplinaLecionada;
    }

    public void setDisciplinaLecionada(DisciplinaLecionada disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "numero=" + numero +
                ", disciplinaLecionada=" + disciplinaLecionada +
                ", aluno=" + aluno +
                '}';
    }
}

