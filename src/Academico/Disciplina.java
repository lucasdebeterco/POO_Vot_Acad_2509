package Academico;

public class Disciplina {
    private String nome;
    private Fase fase;

    public Disciplina(String nome, Fase fase) {
        this.nome = nome;
        this.fase = fase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", fase=" + fase +
                '}';
    }
}
