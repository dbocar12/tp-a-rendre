
public class Exo7 {

	public static void main(String[] args) {
		Joueur[] j = new Joueur[5];
		Equipe team= new Equipe();
        j[0] = new Joueur("Diallo",10);
        j[1] = new Joueur("BEN TAARIT",11);
        j[2] = new Joueur("Luffy",12);
        j[3] = new Joueur("Zoro",1);
        j[4] = new Joueur("Tony",13);
        
        for(int i=0;i<5;i++)
        {
        	team.addJoueur(j[i]);
        }
        String ret=team.toString();
        System.out.println(ret);
        
        team.removeJoueur(j[4]); // On supprime un joueur puis on regarde s'il est present
        boolean b = team.isJoueurPresent("Tony");
        System.out.println("Tony fait il encore partie de l'equipe : "+b);
        
        String ret2=team.toString();
        System.out.println("Nouvelle " + ret2);
        
        //Test fonctionnement nombreMax
        
        EquipeLimitee team2= new EquipeLimitee(2);
        EquipeLimitee team3= new EquipeLimitee(4);
        for(int i=0;i<5;i++)
        {
        	team2.addJoueur(j[i]);
        	team3.addJoueur(j[i]);
        }
        String ret3=team2.toString();
        System.out.println(ret3);
        
        team2.addAllEquipe(team3); //Test de la methode allEquipe
        
	}
	
       
        
	

}
