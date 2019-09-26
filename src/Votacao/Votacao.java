package Votacao;

import java.util.ArrayList;
import java.util.List;

public class Votacao {
    private List<Candidato> candidatos = new ArrayList<>();
    private List<Usuario> Uvotou = new ArrayList<Usuario>();
    private Usuario Uadmin;
    private List<Usuario> UpodeVotar = new ArrayList<Usuario>();

    public Votacao(List<Candidato> candidatos, List<Usuario> uvotou, Usuario uadmin, List<Usuario> upodeVotar) {
        this.candidatos = candidatos;
        Uvotou = uvotou;
        Uadmin = uadmin;
        UpodeVotar = upodeVotar;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Usuario> getUvotou() {
        return Uvotou;
    }

    public void setUvotou(List<Usuario> uvotou) {
        Uvotou = uvotou;
    }

    public Usuario getUadmin() {
        return Uadmin;
    }

    public void setUadmin(Usuario uadmin) {
        Uadmin = uadmin;
    }

    public List<Usuario> getUpodeVotar() {
        return UpodeVotar;
    }

    public void setUpodeVotar(List<Usuario> upodeVotar) {
        UpodeVotar = upodeVotar;
    }

    @Override
    public String toString() {
        return "Votacao{" +
                "candidatos=" + candidatos +
                ", Uvotou=" + Uvotou +
                ", Uadmin=" + Uadmin +
                ", UpodeVotar=" + UpodeVotar +
                '}';
    }
}
