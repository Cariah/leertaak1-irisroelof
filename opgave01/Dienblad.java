import java.util.ArrayList;
import java.util.Stack;
/**
 * Class Dienblad
 * Met klasse dienblad kunnen er dienbladen aangemaakt worden 
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 21/11/2014
 */
public class Dienblad {

    // Declareren van de variabelen
    private Stack<Artikel> artikelen;

    /**
     * Default Constructor
     */
    public Dienblad() {
        // Initialiseren van de variabelen
        artikelen = new Stack<Artikel>();
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     * @return Het aantal artikelen op het dienblad
     */
    public int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen 
     * op het dienblad uit te rekenen
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        double sum = 0;
        for(Artikel artikel : artikelen){
            sum = sum + artikel.getPrijs();
        }
        return sum;
    }
}
