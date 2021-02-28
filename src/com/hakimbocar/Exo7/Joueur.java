package com.hakimbocar.Exo7;

import java.util.Objects;

public class Joueur {

	private String nom;
	private int age;
	
	public Joueur() { //Constructeur vide
    }

	public Joueur(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Joueur : nom = " + nom + ", age = " + age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Joueur)) return false;
		Joueur joueur = (Joueur) o;
		return getAge() == joueur.getAge() && Objects.equals(getNom(), joueur.getNom());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNom(), getAge());
	}

	public int compareTo(Joueur other) {

		return this.nom.compareTo(other.nom); //methode compareTo va comparer les joueurs en fonction de leur nom
	}

}
