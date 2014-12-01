
/**
 * Kantine class.
 * Met de klasse kantine kunnen kantine's aangemaakt worden
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 25/11/2014
 */
public class Kantine
{
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineaanbod;
    
    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar gekoppeld. Maak twee Artikelen aan 
     * en plaats deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan() {
        Persoon persoon = new Persoon();
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        
        Artikel optimel = new Artikel("Optimel", 1.87);
        Artikel water = new Artikel("H2o", 0.95);

        dienblad.voegToe(optimel);
        dienblad.voegToe(water);
        kassarij.sluitAchteraan(persoon);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        /* Opgave 5b
         *
         * De while lus stopt pas wanneer er niemand meer in de KassaRij staat.
         * De for lus stopt nadat de laatste van de rij die er toen was, is verwerkt.
         * Iedereen die daarna aansluit, wordt dan niet meer geholpen.
         * 
         * We maken dus gebruik van 'Onbepaalde Iteratie'
         */ 
        while(kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }
    
    /**
     * Retourneerd de private instantie van kassa
     * @return Kassa de Kassa die wordt gebruikt in de Kantine
     */
    public Kassa getKassa()
    {
        return this.kassa;
    }
    
    /**
     * Retourneerd de private instantie van kantineaanbod
     * @return het kantineaanbod
     */
    public KantineAanbod getKantineAanbod()
    {
        return kantineaanbod;
    }
    
    /**
     * Wijzigd het kantineaanbod
     * @param Er wordt een kantineaanbod verwacht
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod)
    {
        this.kantineaanbod = kantineaanbod;
    }
}
