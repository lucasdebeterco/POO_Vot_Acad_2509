package Votacao;

public class Candidato {
    private int numero;
    private Usuario usuario;

    public Candidato(int numero, Usuario usuario) {
        this.numero = numero;
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "numero=" + numero +
                ", usuario=" + usuario +
                '}';
    }
}
