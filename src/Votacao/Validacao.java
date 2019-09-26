package Votacao;

public class Validacao {
    private String hash;
    private boolean ativo;
    private Usuario usuario;
    private Votacao votacao;

    public Validacao(String hash, boolean ativo, Usuario usuario, Votacao votacao) {
        this.hash = hash;
        this.ativo = ativo;
        this.usuario = usuario;
        this.votacao = votacao;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Votacao getVotacao() {
        return votacao;
    }

    public void setVotacao(Votacao votacao) {
        this.votacao = votacao;
    }

    @Override
    public String toString() {
        return "Validacao{" +
                "hash='" + hash + '\'' +
                ", ativo=" + ativo +
                ", usuario=" + usuario +
                ", votacao=" + votacao +
                '}';
    }
}
