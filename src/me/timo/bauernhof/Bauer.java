package me.timo.bauernhof;

import java.util.ArrayList;

public class Bauer {

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Beziehung
    private ArrayList<Tier> tierliste = new ArrayList<>();
    private Hof hof;

    public ArrayList<Tier> getTierliste() {
        return tierliste;
    }

    public void setTierliste(ArrayList<Tier> tierliste) {
        this.tierliste = tierliste;
    }

    public Hof getHof() {
        return hof;
    }

    public void setHof(Hof hof) {
        this.hof = hof;
    }

    public void setHofGröße(double größe) {
        hof.setGröße(größe);
    }

    public double getHofGröße() {
        return hof.getGröße();
    }

    // Konstruktor
    public Bauer() {

    }

    public Bauer(String name) {
        this.name = name;
    }

    public Bauer(String name, ArrayList<Tier> tierliste) {
        this.name = name;
        this.tierliste = tierliste;
        for (Tier tier : tierliste) {
            tier.setBauer(this);
        }
    }

    public Bauer(String name, ArrayList<Tier> tierliste, Hof hof) {
        this.name = name;
        this.tierliste = tierliste;
        for (Tier tier : tierliste) {
            tier.setBauer(this);
        }
        this.hof = hof;
    }

    public Bauer(String name, Hof hof) {
        this.name = name;
        this.hof = hof;
    }

    // Methoden des Bauern
    public void tiereFüttern() {
        for (Tier tier : tierliste) {
            tier.essen();
        }
    }

    public void feldKaufen() {
        setHofGröße(getHofGröße() + 100);
        getHof().setGröße(getHof().getGröße() + 100);
    }
}
