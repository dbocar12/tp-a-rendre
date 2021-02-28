package com.hakimbocar.Exo7;
import java.util.ArrayList;

public class EquipeLimitee {

	private int nombreMax;
	private ArrayList<Joueur> listeJoueurs;


	public EquipeLimitee(int nbMax) { // Constructeur
		this.listeJoueurs = new ArrayList<>();
		this.nombreMax=nbMax;
	}

	// Modif de la methode addJoueur : avant d'ajouter un joueur on verifie tout d'abord qu'on a pas depasse la valeur max
	public void addJoueur(Joueur j) { 
		int nbJoueur = getNombreJoueurs();
		if(nbJoueur < nombreMax)
		{
			listeJoueurs.add(j);
		}
		else
		{
			System.out.println("[STOP] Impossible, le nombre de joueur max atteint"+
					" [ "+this.nombreMax+" ]");
		}
	}
	public boolean removeJoueur(Joueur j) {
		return listeJoueurs.remove(j);
	}

	public boolean isJoueurPresent(Joueur j) {
		return listeJoueurs.contains(j);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Equipe : ").append(listeJoueurs.size())
				.append(" joueurs\n");

		for (Joueur element : listeJoueurs) {
			str.append(element).append("\n");
		}

		return str.toString();
	}

	/* Question 5 */
	public void addAllEquipe(EquipeLimitee team2) {
		int i;
		Joueur joueur;
		int sz = listeJoueurs.size();
		for (i = 0; i < sz; i++) {
			joueur = listeJoueurs.get(i);
			if (team2.isJoueurPresent(joueur)) { // On verifie d'abord si ce joueur est present dans les deux equipes
				this.removeJoueur(joueur); // Si c'est le cas, on supprime le joueur dans notre equipe
			}
		}
		listeJoueurs.addAll(team2.listeJoueurs); // On ajoute finalement la deuxieme equipe a la premiere avec la methode addALL

	}

	/* Question 6 */
	public void clear() {
		listeJoueurs.clear();
	}

	/* Question 7 */
	public int getNombreJoueurs() {
		return listeJoueurs.size();
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
		for (Joueur listeJoueur : listeJoueurs) {
			s += listeJoueur.getAge();
		}
		moy=(double)s/sz;
		return moy;

	}
	
	
}
