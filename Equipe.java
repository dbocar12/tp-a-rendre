import java.util.ArrayList;

public class Equipe {
	private ArrayList<Joueur> listeJoueurs;

	public Equipe() { 
		listeJoueurs = new ArrayList<Joueur>();
	}

	public void addJoueur(Joueur j) {
		listeJoueurs.add(j);
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
	public void addAllEquipe(Equipe team2) {
		int i;
		Joueur joueur;
		int sz = listeJoueurs.size();
		for (i = 0; i < sz; i++) {
			joueur = listeJoueurs.get(i);

			if (team2.isJoueurPresent(joueur.getNom())) { // On verifie d'abord si un joueur de meme nom est present dans les deux equipes
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
