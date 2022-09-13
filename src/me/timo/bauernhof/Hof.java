package me.timo.bauernhof;

public class Hof {

    private String adresse = "";
    private double größe = 0;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getGröße() {
        return größe;
    }

    public void setGröße(double größe) {
        this.größe = größe;
    }

    public Hof() {

    }

    public Hof(String adresse, double größe) {
        this.adresse = adresse;
        this.größe = größe;
    }

}
