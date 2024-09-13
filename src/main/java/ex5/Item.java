package ex5;

/** Représente un objet avec un nom et un poids
 *
 */
public class Item {

    private String nom;
    private int poids;

    /** Constructeur pour créer un objet avec un nom et un poids
     *
     * @param nom       nom de l'objet
     * @param poids     poids de l'objet
     */
    public Item(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
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
     * Getter pour l'attribut poids
     *
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour l'attribut poids
     *
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
