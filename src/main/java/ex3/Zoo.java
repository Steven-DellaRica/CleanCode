package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private final List<Animal> animaux;

    /**
     * Constructeur pour créer un zoo avec un nom
     *
     * @param nom   le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo avec ses attributs
     *
     * @param nom           le nom de l'animal
     * @param type          le type de l'animal
     * @param comportement  le comportement de l'animal
     */
    public void addAnimal(String nom, String type, String comportement) {
        Animal animal = new Animal(nom, type, comportement);
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux présents dans le zoo
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /** Retourne le nombre d'animaux dans le zoo
     *
     * @return int
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
