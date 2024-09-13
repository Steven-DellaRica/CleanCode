package ex5;

import java.util.ArrayList;
import java.util.List;

/** Représente une caisse contenant une liste d'objets
 *
 */
public class Caisse {

    private String nom;
    private List<Item> items;
    private double poidsMax;

    /**
     * Constructeur pour créer une caisse avec un nom et un poids max
     *
     * @param nom           nom de la caisse
     * @param poidsMax      poids maximum que la caisse peut contenir
     */
    public Caisse(String nom, double poidsMax) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMax = poidsMax;
    }

    /** Ajoute un objet à la caisse si le poids est acceptable
     *
     * @param item      objet à ajouter
     * @return      true si l'objet à été ajouté sinon false
     */
    public boolean ajouterObjet(Item item) {
        if(item.getPoids() <= poidsMax) {
            items.add(item);
            return true;
        }
        return false;
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Getter pour l'attribut poidsMax
     *
     * @return the poidsMax
     */
    public double getPoidsMax() { return poidsMax; }

    /**
     * Setter pour l'attribut poidsMax
     *
     * @param poidsMax the items to set
     */
    public void setPoidsMax(double poidsMax) { this.poidsMax = poidsMax; }

}
