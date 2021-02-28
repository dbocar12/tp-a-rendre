package com.hakimbocar.Exo7;

import java.util.*;

public class Exo7 {

public static void main(String[] args) {
        List<Joueur> j = new ArrayList<>();
        List<Joueur> joueurs = new ArrayList<>();
        Equipe team = new Equipe();
        Equipe teamCopie = new Equipe();
        EquipeLimitee team2 = new EquipeLimitee(3);
        EquipeLimitee team3 = new EquipeLimitee(2);

        // Test de la methode sort pour trier
        joueurs.add(new Joueur("Monkey", 25));
        joueurs.add(new Joueur("Luffy", 15));
        joueurs.add(new Joueur("Zoro", 24));
        joueurs.add(new Joueur("Sanji", 23));
        System.out.println("Liste de joueurs : ");
        for (Joueur je : joueurs) {
                System.out.println(je);
        }
        System.out.println("\nListe de joueurs triés : ");
        Collections.sort(joueurs);
        for (Joueur je : joueurs) {
                System.out.println(je);
        }

        // clear joueurs
        joueurs.clear();
        System.out.println();

        // ajouter des joueurs dans la liste j
        j.add(new Joueur("Diallo",10));
        j.add(new Joueur("BEN TAARIT",11));
        j.add(new Joueur("Luffy",12));
        j.add(new Joueur("Zoro",1));
        j.add(new Joueur("Tony",13));

        // Ajouter des joueurs de la liste j dans l'équipe team
        Collections.sort(j); // trier les joueurs par ordre alphabetique
        for (Joueur joueur : j) {
            team.addJoueur(joueur);
        }
        // Afficher l'equipe team
        System.out.println(team);

        // On supprime un joueur puis on regarde s'il est present
        if (team.removeJoueur(j.get(4))){
            System.out.println(j.get(4)+" est retiré du team");
        }
        boolean b = team.isJoueurPresent(j.get(4));
        System.out.println("Tony fait il encore partie de l'equipe : "+b);
        System.out.println("\nNouvelle " + team);

        teamCopie.addJoueur(j.get(1));
        Collections.sort(j);
        System.out.println(teamCopie);

        // Ajouter tous les joueurs de l equipe team dans teamCopie
        teamCopie.addAllEquipe(team);
        System.out.print("Nouvelle copie : \n"+teamCopie);
        System.out.println("Moyenne age : "+teamCopie.getMoyenneAge());
        System.out.println("Nombre de Joueurs : "+teamCopie.getNombreJoueurs());
        System.out.println();

        // Suppression d une equipe
        System.out.println("Aprés suppression de l'équipe");
        teamCopie.clear();
        System.out.println(teamCopie);

        //Test EquipeLimitee
        for(int i=0;i<5;i++)
        {
            team2.addJoueur(j.get(i));

        }
        Collections.sort(j);
        System.out.println("[+] "+team2.getNombreJoueurs()+" joueurs sont ajoutes\n");
        System.out.print(team2);
        System.out.println("Age moyenne : "+ team2.getMoyenneAge());
        if (team2.removeJoueur(j.get(0))) {
                System.out.println(j.get(0)+" est retire de l equipe");
        }
        // supprimer l equipe team2
        team3.addAllEquipe(team2);
        team2.clear();
        System.out.println("\nNouvelle "+team3);
        }

}
