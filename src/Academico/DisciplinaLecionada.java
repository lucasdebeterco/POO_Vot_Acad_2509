package Academico;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaLecionada {
    private List<Professor> professores = new ArrayList<>();
    private Disciplina disciplina;

    public DisciplinaLecionada(List<Professor> professores, Disciplina disciplina) {
        this.professores = professores;
        this.disciplina = disciplina;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "DisciplinaLecionada{" +
                "professores=" + professores +
                ", disciplina=" + disciplina +
                '}';
    }
}
