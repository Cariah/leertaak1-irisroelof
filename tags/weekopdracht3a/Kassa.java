import java.util.Iterator;

/**
 * Met de klasse Kassa kunnen er kassa's aangemaakt worden
 * @author Roelof Kallenkoot 
 * @author Iris Meijer
 * @version 25/11/2014
 */
public class Kassa
{

    private KassaRij kassarij;
    private double geldInKassa;
    private int aantalArtikelen;

    /**
     * Constructor for objects of class Kassa
     */
    public Kassa(KassaRij kassarij)
    {
        // initialise instance variables
        geldInKassa = 0;
        aantalArtikelen = 0;
        this.kassarij = kassarij;
    }

    /**
     * Telt de prijs die de persoon moet betalen bij geldInKassa op
     * Telt het aantal artikelen die de persoon koopt op bij aantalArtikelen
     * 
     * Vanuit deze methode wordt de betaling afgehandeld
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        Dienblad dienblad = persoon.getDienblad();
        
        Iterator<Artikel> artikelen = dienblad.getArtikelen();
        while(artikelen.hasNext()){
            Artikel artikel = artikelen.next();
            aantalArtikelen += 1;
            geldInKassa += artikel.getPrijs();
        }
        
    }

    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd, vanaf het moment 
     * dat de methode resetWaarden is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return geldInKassa;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        geldInKassa = 0;
        aantalArtikelen = 0;
    }

}
