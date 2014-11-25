
/**
 * Write a description of class Kantine here.
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version (a version number or a date)
 */
public class Kantine
{
    private Kassa kassa;
    private KassaRij kassarij;
    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats
     * deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan() {
        //omitted
        Persoon persoon = new Persoon("BSN", "Iris", "Meijer", 'V', 20, 6,1997);
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);

        Artikel optimel = new Artikel("Optimel", 1.87);
        Artikel water = new Artikel("H2o", 0.95);

        persoon.pakArtikel(optimel);
        persoon.pakArtikel(water);
        this.kassarij.sluitAchteraan(persoon);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        /* Opgave 5b
        /*
         * De while lus stopt pas wanneer er niemand meer in de KassaRij staat.
         * De for lus stopt nadat de laatste van de rij die er toen was, is verwerkt.
         * Iedereen die daarna aansluit, wordt dan niet meer geholpen.
         */ 
        while(kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
            System.out.println("Verlaat rij");
        }
    }

    /**
     * Deze methode telt het geld uit de kassa
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa() {
        //omitted
        return kassa.hoeveelheidGeldInKassa();
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen(){
        //omitted
        return kassa.aantalArtikelen();
    }

    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() {
        // omitted
        kassa.resetKassa();
    }
}
