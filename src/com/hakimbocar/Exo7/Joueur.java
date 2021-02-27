package com.hakimbocar.Exo7;
public class Joueur {

	private String nom;
	private int age;
	
	public Joueur() { //Constructeur vide
    }
	
	public Joueur(String nomJoueur,int ageJoueur) { //Constructeur 
		
		nom=nomJoueur;
		age=ageJoueur;
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
		return "Joueur : nom=" + nom + ", age=" + age + "]";
	}

	public boolean equals(Object u)
	{
		if(!(u instanceof Joueur)) {
			return false;
		}
		Joueur u1=(Joueur)u;
		return (nom==u1.nom)&&(age==u1.age);
	}
	
	public int compareTo(Joueur other) {
		
		return this.nom.compareTo(other.nom); //methode compareTo va comparer les joueurs en fonction de leur nom
	}
	

}
