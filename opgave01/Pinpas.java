
/**
 * Pinpas Class
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 16-12-2014
 */
public class Pinpas extends Betaalwijze {
    private double kredietlimiet;

    /**
     * default constructor voor pinpas
     */
    public Pinpas()
    {
        setSaldo(0);
        setKredietLimiet(150);
    }
    
    /**
     * Constructor van pinpas
     * @param double saldo
     * @param double kredietlimiet
     */
    public Pinpas(double saldo, double kredietlimiet){
        setSaldo(saldo);
        setKredietLimiet(kredietlimiet);
    }

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     * @param double tebetalen
     */
    public boolean betaal(double tebetalen) {
        double som = saldo + kredietlimiet;
        if(tebetalen <= som){
            if(saldo >= tebetalen){
                saldo-= tebetalen;
            }
            if((saldo - tebetalen) < 0){
                tebetalen-= saldo;
                setSaldo(0);
                kredietlimiet -= tebetalen;
            }
            return true;
        }
        
        return false;
    }
}