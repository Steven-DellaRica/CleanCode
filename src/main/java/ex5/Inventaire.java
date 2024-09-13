package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    /** Constructeur pour créer un inventaire.
     *
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 5));
        caisses.add(new Caisse("Moyens objets", 20));
        caisses.add(new Caisse("Grands objets", 40));
    }

    /** Ajoute un objet dans la caisse appropriée en fonction du poids.
     *
     * @param item      objet à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.ajouterObjet(item)) {
                return;
            }
        }
    }

    /** Retourne le nombre total d'objets dans les caisses
     *
     * @return le nombre total d'objets, INT
     */
    public int taille() {
        int totalItems = 0;

        for (Caisse caisse : caisses) {
            totalItems += caisse.getItems().size();
        }
        return  totalItems;
    }
}
