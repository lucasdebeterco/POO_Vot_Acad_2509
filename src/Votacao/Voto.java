package Votacao;

public class Voto {
    private Votacao votacao;

    public Voto(Votacao votacao) {
        this.votacao = votacao;
    }

    public Votacao getVotacao() {
        return votacao;
    }

    public void setVotacao(Votacao votacao) {
        this.votacao = votacao;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "votacao=" + votacao +
                '}';
    }
}
