package com.hakimbocar.Exo8;

import java.util.*;

public class RegistreJoueurs {

    private Map<Integer,List<Joueur>> map= new HashMap<>();

    public void setMap(Map<Integer, List<Joueur>> map) {
        this.map = map;
    }

    /*
        la methode addJoueur(Joueur) permet d'ajouter le joueur en paramètre à la table de
        hachage.
        Si la clé à laquelle doit être attachée le joueur n’existe pas, alors il faut la créer.
        */
    public void addJoueur(Joueur j) {
        int decennie = j.getAnneeDenaissance() - j.getAnneeDenaissance()%10;
        if(map.get(decennie) == null) {
            List<Joueur> valeurs = new ArrayList<>();
            valeurs.add(j);
            map.put(decennie,valeurs);

        }else{
            List<Joueur> valeurs = map.get(decennie);
            valeurs.add(j);
        }

    }

    /*
        une méthode get(int) qui retourne la liste des joueurs nés dans cette décennie.
     */
    public List<Joueur> get(int decennie) {
        List<Joueur> joueursDecennie = new ArrayList<>();
        Set<Map.Entry<Integer,List<Joueur>>> entrySet = map.entrySet();
        for (Map.Entry<Integer, List<Joueur>> entry :entrySet ) {
            if(entry.getKey().equals(decennie)){
                joueursDecennie = entry.getValue();
            }
        }
        return joueursDecennie;
    }
    /*
        une méthode count(int) qui retourne le nombre de joueurs nés dans cette décennie.
     */
    public  int count(int decennie) {
        List<Joueur> joueursDecennie;
        int compte;
        joueursDecennie = this.get(decennie);
        compte = joueursDecennie.size();
        return compte;
    }

    /*
        une méthode count() qui retourne le nombre total de joueurs enregistrés dans le registre.
     */
    public  int count() {
        int compte = 0;
        for (List<Joueur> l : map.values()) {
            compte += l.size();
        }

        return compte;
    }

    @Override
    public String toString() {
        Set<Map.Entry<Integer,List<Joueur>>> entrySet = this.map.entrySet();
        StringBuilder str = new StringBuilder();
        StringBuilder last = new StringBuilder();
        str.append("Nombre de decennies : ").append(map.values().size()).append("\n");

        for (Map.Entry<Integer, List<Joueur>> entry :entrySet) {
            str.append(entry.getKey()).append(" \t{ ").
                    append(this.count(entry.getKey())).
                    append(" Joueurs } : \t").
                    append(" ").append(entry.getValue()).
                    append("\n");
        }
        last.append(str.toString().replace(']',' ').
                replace('[',' ')).
                append("Total   { ").
                append(this.count()).append(" Joueurs }\n");

        return last.toString();
    }
}
