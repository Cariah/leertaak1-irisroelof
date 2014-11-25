
/**
 * Write a description of class Kassa here.
 * 
 * @author Roelof Kallenkoot 
 * @version (a version number or a date)
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
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        //method body omitted
        geldInKassa += persoon.getTotaalPrijs();
        aantalArtikelen += persoon.getAantalArtikelen();
        System.out.println("###############");
        System.out.println("# Totaalprijs: " + persoon.getTotaalPrijs());
        System.out.println("# Aantal artikelen: " + persoon.getAantalArtikelen());
        System.out.println("###############");
        
    }

    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        //method body omitted
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        //method body omitted
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
