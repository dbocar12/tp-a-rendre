package com.hakimbocar.Exo8;
import java.util.*;

public class Exo8 {

    public static void main(String[] args) {
        List<Joueur> joueurs = new ArrayList<>();
        List<Joueur> joueursDecennie;
        Map<Integer,List<Joueur>> map= new HashMap<>();
        RegistreJoueurs reg = new RegistreJoueurs();
        reg.setMap(map);

        joueurs.add(new Joueur("Laurent",1965));
        joueurs.add(new Joueur("Marcel",1968));
        joueurs.add(new Joueur("Patrick",1976));
        joueurs.add(new Joueur("Alain",1970));
        joueurs.add(new Joueur("Didier",1968));

        // Ajoutons tous ces joueurs dans la table de hachage
        for (Joueur j : joueurs) {
            reg.addJoueur(j);
        }
        System.out.println(reg);
        joueursDecennie = reg.get(1960);
        System.out.println("Les Joueurs de la décennie 1960 :  "+joueursDecennie.
                toString().replace('[',  ' ').
                replace(']',' '));

        System.out.println("Le nombre total de joueurs enregistrés dans le registre : "+reg.count());

        joueurs.clear();
        joueurs.add(new Joueur("Steve",1980));
        joueurs.add(new Joueur("Hugo",1986));
        joueurs.add(new Joueur("Djibril",1992));
        joueurs.add(new Joueur("Blaise",1987));
        joueurs.add(new Joueur("Paul",1993));


        System.out.println("\n--- Nouvelle table de hachage  : ");
        // Ajoutons tous ces joueurs de plus dans la table de hachage
        for (Joueur j : joueurs) {
            reg.addJoueur(j);
        }
        System.out.println(reg);
    }

}
