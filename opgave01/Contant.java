
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
        this.saldo = setSaldo(saldo);;
    }
    
    /**
     * Constructor
     * @param double Saldo
     */
    public Contant(double saldo){
        this.saldo = setSaldo(saldo);
    }
    
    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        // omitted
        return false;
    }
}
