package fr.hashimiste.maps;

import fr.hashimiste.Difficulte;

import java.util.ArrayList;
import java.util.List;


 
 
 
 
public class Grille {
    private final Difficulte difficulte;
    private final List<Ile> iles;
    private final List<Pont> ponts;

    
     
     
     
     
     
     
    public Grille(Difficulte difficulte, List<Ile> iles, List<Pont> ponts) {
        this.difficulte = difficulte;
        this.iles = iles;
        this.ponts = ponts;
    }

    
     
     
     
     
     
    public Grille(Difficulte difficulte, List<Ile> iles) {
        this(difficulte, iles, new ArrayList<>());
    }

    
     
     
     
     
    public Grille(Difficulte difficulte) {
        this(difficulte, new ArrayList<>());
    }

    
     
     
     
     
    public Difficulte getDifficulte() {
        return difficulte;
    }

    
     
     
     
     
    public List<Ile> getIles() {
        return iles;
    }

    
     
     
     
     
    public List<Pont> getPonts() {
        return ponts;
    }
}
