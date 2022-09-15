package me.timo.bauernhof;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tier> tierliste = new ArrayList<>();
        tierliste.add(new Tier( "Schaf", false, ""));
        Hof hof = new Hof("Wiesenstraße 1", 50);
        Bauer bauer = new Bauer("Hans", tierliste, hof);
        System.out.println("Der Hof hat " + bauer.getHofGröße() + " Quadratmeter");
        System.out.println("Der Hof wird vergrößert");
        bauer.feldKaufen();
        System.out.println("Der Hof hat " + bauer.getHofGröße() + " Quadratmeter");
        for (Tier tier : bauer.getTierliste()) {
            tier.begrüßen();
        }
        System.out.println("Tier Liste:");
        for (Tier tier : bauer.getTierliste()) {
            System.out.println("- " + tier.getName() + " ist " + (tier.isSatt() ? "satt" : "nicht satt"));
        }
        System.out.println("Tier werden gefüttert");
        bauer.tiereFüttern();
        System.out.println("Tier Liste:");
        for (Tier tier : bauer.getTierliste()) {
            System.out.println("- " + tier.getName() + " ist " + (tier.isSatt() ? "satt" : "nicht satt"));
        }
    }

}
