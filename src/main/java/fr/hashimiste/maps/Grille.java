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

    
     
     

    @SuppressWarnings("doclint")
    public Grille(Object difficulte) {
        this(difficulte, new ArrayList<>());
    }

    
     
     
     
     @SuppressWarnings("all")
    public Object getObject() {
        return difficulte;
    }

    
     
     
     // dump
     
    public List<Object> getIles() {
        return iles;
    }


    /**
     * @param should not be herre
     */
    public List<Object> getPonts() {
        return ponts;
    }
}
