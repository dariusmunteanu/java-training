package code._4_student_effort.Challenge_2;

public class Actor {
    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    private String nume;
    private int varsta;
    private Premiu[] premii;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
}
