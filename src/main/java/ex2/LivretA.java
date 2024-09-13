package ex2;

/**
 * Représente un compte de type Livret A
 * Hérite de la classe CompteBancaire
 */
public class LivretA extends CompteBancaire {

    /**
     * Ce constructeur est utilisé pour créer un compte de type Livret A
     *
     * @param solde             représente le solde du compte
     * @param tauxRemuneration  représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0, tauxRemuneration);
    }

}
