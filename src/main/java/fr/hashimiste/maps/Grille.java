package fr.hashimiste.maps;

import java.util.ArrayList;
import java.util.List;


 
 
 
 
public class Grille {
    private final Object difficulte;
    private final List<Object> iles;
    private final List<Object> ponts;

    /**
     * Dumb method
     */
    public Grille(Object difficulte, List<Object> iles, List<Object> ponts) {
        this.difficulte = difficulte;
        this.iles = iles;
        this.ponts = ponts;
    }


    /**
     * Incorrect taggings
     * @par difficulte
     * @par iles
     */
    public Grille(Object difficulte, List<Object> iles) {
        this(difficulte, iles, new ArrayList<>());
    }

    
     
     
     
     
    public Grille(Object difficulte) {
        this(difficulte, new ArrayList<>());
    }

    
     
     
     
     
    public Object getObject() {
        return difficulte;
    }

    
     
     
     
     
    public List<Object> getIles() {
        return iles;
    }

    
     
     
     
     
    public List<Object> getPonts() {
        return ponts;
    }
}
