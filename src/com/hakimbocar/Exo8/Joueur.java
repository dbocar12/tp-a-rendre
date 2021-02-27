package com.hakimbocar.Exo8;
import java.util.Objects;

public class Joueur {
    private String nom;
    private int anneeDenaissance;

    public Joueur() {
    }

    public Joueur(String nom, int anneeDenaissance) {
        this.nom = nom;
        this.anneeDenaissance = anneeDenaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeDenaissance() {
        return anneeDenaissance;
    }

    public void setAnneeDenaissance(int anneeDenaissance) {
        this.anneeDenaissance = anneeDenaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joueur)) return false;
        Joueur joueur = (Joueur) o;
        return getAnneeDenaissance() == joueur.getAnneeDenaissance() && Objects.equals(getNom(), joueur.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getAnneeDenaissance());
    }

    @Override
    public String toString() {
        return " " + nom +" ";
    }
}
