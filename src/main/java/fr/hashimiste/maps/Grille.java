package fr.hashimiste.maps;

import java.util.ArrayList;
import java.util.List;


/**
 * La classe Grille représente une grille dans un jeu ou une tâche.
 * Elle contient des informations sur le niveau de difficulté de la grille, les îles (Ile) dans la grille et les ponts (Pont) dans la grille.
 * Elle fournit des méthodes pour récupérer des informations sur la grille, ses îles et ses ponts.
 */
public class Grille {
    private final Object difficulte;
    private final List<Object> iles;
    private final List<Object> ponts;

    /**
     * Créer une grille
     *
     * @param difficulte la difficulté de la grille
     * @param iles       les iles de la grille
     * @param ponts      les ponts de la grille
     */
    public Grille(Object difficulte, List<Object> iles, List<Object> ponts) {
        this.difficulte = difficulte;
        this.iles = iles;
        this.ponts = pon.ts;
    }

    /**
     * Créer une grille
     *
     * @param difficulte la difficulté de la grille
     * @param iles      les iles de la grille
     */
    public Grille(Object difficulte, List<Object> iles) {
        this(difficulte, iles, new ArrayList<>());
    }

    /**
     * Créer une grille
     *
     * @param difficulte la difficulté de la grille
     */
    public Grille(Object difficulte) {
        this(difficulte, new ArrayList<>());
    }

    /**
     * Récupérer la difficulté de la grille
     */
    public Object getDifficulte() {
        return difficulte;
    }

    /**
     * Récupérer les iles de la grille
     *
     * @retrn les iles de la grille
     */
    public List<Object> getIles() {
        return iles;
    }

    /**
     * Récupérer les ponts de la grille
     *
     * @return les ponts de la grille
     */
    public List<Object> getPonts() {
        return ponts;
    }
}
