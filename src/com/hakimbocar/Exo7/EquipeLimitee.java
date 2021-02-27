package com.hakimbocar.Exo7;
import java.util.ArrayList;

public class EquipeLimitee {

	private int nombreMax;
	
	private ArrayList<Joueur> listeJoueurs;

	public EquipeLimitee(int nbMax) { // Constructeur 
		listeJoueurs = new ArrayList<Joueur>();
		nombreMax=nbMax;
	}

	// Modif de la methode addJoueur : avant d'ajouter un joueur on verifie tout d'abord qu'on a pas depasse la valeur max
	public void addJoueur(Joueur j) { 
		int nbJoueur=getNombreJoueurs();
		if(nbJoueur<nombreMax)
		{
			listeJoueurs.add(j);
		}
		else
		{
			System.out.println("Nombre de joueur max autorise depasse");
		}
	}

	public boolean removeJoueur(Joueur j) {
		boolean b;
		b = listeJoueurs.remove(j);
		return b;
	}

	public boolean isJoueurPresent(String nom) {
		int i;
		int sz = listeJoueurs.size();
		for (i = 0; i < sz; i++) {
			if (nom.equalsIgnoreCase(listeJoueurs.get(i).getNom())) // On compare les noms en ne tenant pas comptes des
																	// majuscules/minuscules
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String ret;
		int i;
		int sz = listeJoueurs.size();
		Joueur j;

		ret = "Equipe :\n";
		for (i = 0; i < sz; i++) {
			j = listeJoueurs.get(i);
			ret = ret + "nom= " + j.getNom() + " , age=" + j.getAge() + "\n";

		}

		return ret;
	}

	/* Question 5 */
	// Modif : Avant de rassembler les 2 equipes on verifie que la taille des 2 equipes - les doublons est inf a la limite
	public boolean addAllEquipe(EquipeLimitee team2) {
		int i,c=0;
		Joueur joueur;
		int sz = listeJoueurs.size();
		for (i = 0; i < sz; i++) { 
			joueur = listeJoueurs.get(i);
			if (team2.isJoueurPresent(joueur.getNom())) { // On verifie d'abord si un joueur de meme nom est present dans les deux equipes
				c++; // Si c'est le cas, on incremente le compteur
			}	
		}
		int a = getNombreJoueurs();
		int b=team2.getNombreJoueurs();
		if (a+b-c>nombreMax) { 
			System.out.println("Nombre de joueur max autorise depasse");
			return false;
		}
		
		for (i = 0; i < sz; i++) {
			joueur = listeJoueurs.get(i);

			if (team2.isJoueurPresent(joueur.getNom())) { // On verifie d'abord si un joueur de meme nom est present dans les deux equipes
				this.removeJoueur(joueur); // Si c'est le cas, on supprime le joueur dans notre equipe
			}
		}
		
		listeJoueurs.addAll(team2.listeJoueurs); // On ajoute finalement la deuxieme equipe a la premiere avec la methode addALL
		return true;
	}

	/* Question 6 */
	public void clear() {
	  listeJoueurs.clear();
		
	}
	
	/* Question 7 */
	public int getNombreJoueurs() {
		  int a=listeJoueurs.size();
		  return a;
	}
	
	/* Question 8 */
	public double getMoyenneAge() {
		  int sz=listeJoueurs.size();
		  int s=0;
		  double moy;
		  if(sz==0) {
			  moy=0;
			  return moy; 
		  }
		  for (int i = 0; i < sz; i++) {
				s += listeJoueurs.get(i).getAge();
		  }
		  moy=s/sz;
		  return moy; 
	
	}
	
	
}
