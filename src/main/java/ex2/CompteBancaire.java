package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public class CompteBancaire {

    /**
     * Les différents type de compte gérés par cette classe
     * CC=Compte courant, ou soit LA=Livret A
     */
    public enum TypeCompte {
        CC,
        LA
    };

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private TypeCompte type;

    /**
     * Ce constructeur est utilisé pour créer un compte de type Compte Courant
     *
     * @param solde     représente le solde du compte
     * @param decouvert représente le découvert autorisé
     */
    public CompteBancaire( double solde, double decouvert) {
        super();
        this.type = TypeCompte.CC;
        this.solde = solde;
        this.decouvert = decouvert;
    }


    /**
     * Ce constructeur est utilisé pour créer un compte de type Livret A
     *
     * @param solde            représente le solde du compte
     * @param decouvert        représente le découvert autorisé
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public CompteBancaire(double solde, double decouvert, double tauxRemuneration) {
        super();
        this.type = TypeCompte.LA;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant montant que l'on veut ajouter au compte
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde
     *
     * @param montant montant que l'on veut débiter du compte
     */
    public void debiterMontant(double montant) {
        if (type == TypeCompte.CC) {
            if (this.solde - montant > decouvert) {
                this.solde = solde - montant;
            }
        } else if (type == TypeCompte.LA) {
            if (this.solde - montant > 0) {
                this.solde = solde - montant;
            }
        }
    }

    /**
     * Applique une rémunération annuelle en fonction du solde du compte et du taux rémunération
     */
    public void appliquerRemuAnnuelle() {
        if (type == TypeCompte.LA) {
            this.solde = solde + solde * tauxRemuneration / 100;
        }
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public Enum<TypeCompte> getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(TypeCompte type) {
        this.type = type;
    }
}
