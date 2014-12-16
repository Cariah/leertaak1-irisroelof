
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
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        //omitted
        return true;
    }
}