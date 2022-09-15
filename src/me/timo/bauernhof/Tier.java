package me.timo.bauernhof;

public class Tier {

    // Attribute
    private String name = "";
    private boolean satt = true;
    private String ton = "";

    // Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatt() {
        return satt;
    }

    public void setSatt(boolean satt) {
        this.satt = satt;
    }

    public String getTon() {
        return ton;
    }

    public void setTon(String ton) {
        this.ton = ton;
    }

    // Beziehung
    private Bauer bauer;

    public Bauer getBauer() {
        return bauer;
    }

    public void setBauer(Bauer bauer) {
        this.bauer = bauer;
    }

    public Tier() {

    }

    public Tier(String name, boolean satt, String ton) {
        this.name = name;
        this.satt = satt;
        this.ton = ton;
    }

    public Tier(String name, boolean satt, String ton, Bauer bauer) {
        this.name = name;
        this.satt = satt;
        this.ton = ton;
        this.bauer = bauer;
        this.bauer.getTierliste().add(this);
    }

    public void begrüßen() {
        System.out.println(name + ": Hallo!");
    }

    public void essen()
    {
        this.satt = true;
    }

}
