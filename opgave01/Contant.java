
/**
 * Contant Class
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 16/12/2014
 */
public class Contant extends Betaalwijze
{
    /**
     * Default Constructor
     */
    public Contant(){
        setSaldo(0);
    }
    
    /**
     * Constructor
     * @param double Saldo
     */
    public Contant(double saldo){
        setSaldo(saldo);
    }
    
    /**
     * Methode om betaling af te handelen
     * @param double te betalen diagram
     */
    public boolean betaal(double tebetalen) {
        if(saldo >= tebetalen){
            saldo -= tebetalen;
            return true;
        }
        return false;
    }
}
