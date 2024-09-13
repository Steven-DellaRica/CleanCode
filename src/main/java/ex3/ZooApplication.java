package ex3;

/**
 * Classe pour lancer l'application du zoo
 */
public class ZooApplication {

    /**
     * Comportement de l'application au lancement
     *
     * @param args
     */
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        ajouterAnimauxAuZoo(zoo);
        zoo.afficherListeAnimaux();
    }

    /**
     * Ajoute une   liste d'animaux
     * @param zoo   instance du zoo dans lequel ajouter les animaux
     */
    private static void ajouterAnimauxAuZoo(Zoo zoo) {
        zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Lion", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Requin blanc", "POISSON", "CARNIVORE");
        zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
        zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
        zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
    }
}
