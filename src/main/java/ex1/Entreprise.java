package ex1;

// java.util.date est obsolète, je remplace par java.time.LocalDate
import java.time.LocalDate;

public class Entreprise {

    //Attributs privés de l'entreprise
    private int siret;
    private String nom;
    private String adresse;
    private LocalDate dateCreation;

    public static final int CAPITAL_MAX = 3_000_000;

    /**
     * Méthode pour afficher le statut de l'entreprise
     */
    public void afficherStatut() {

    }

}
