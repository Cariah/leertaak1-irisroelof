
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
     * Methode om betaling af te handelen gooit teWeinigGeldException
     * als de persoon niet genoeg geld heeft.
     * @param tebetalen
     * @throws TeWeinigGeldException
     */
    public abstract void betaal(double tebetalen) throws TeWeinigGeldException;

}
