package com.hakimbocar.Exo7;

import java.util.ArrayList;
import java.util.Collection;

public class Equipe {
    private Collection<Joueur> joueurs= new ArrayList();
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Equipe : " + joueurs.size()+"\n");
        for (Joueur element : joueurs) {

           str.append(""+element);
        }
        return str.toString();
    }
}
