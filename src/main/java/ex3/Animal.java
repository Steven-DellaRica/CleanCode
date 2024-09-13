package ex3;

/**
 * Représente un animal avec un nom, un type et un comportement
 */
public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur pour créer un animal
     *
     * @param nom           Le nom de l'animal
     * @param type          Le type de l'animal
     * @param comportement  Le comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter for nom
     *
     * @return string
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter for nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for type
     *
     * @return string
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for type
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for comportement
     *
     * @return string
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter for comportement
     *
     * @param comportement the comportement to set
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
