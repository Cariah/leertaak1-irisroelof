
/**
 * Abstract class Betaalwijze - write a description of the class here
 *
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 16/12/2014
 */
public abstract class Betaalwijze
{
    protected double saldo;

    /**
     * Methode om krediet te initialiseren
     * @param krediet
     */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    /**
     * Methode om betaling af te handelen
     * @param tebetalen
     * @return Boolean om te kijken of er voldoende saldo is
     */
    public abstract boolean betaal(double tebetalen);

}
