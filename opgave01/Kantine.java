
/**
 * Kantine class.
 * Met de klasse kantine kunnen kantine's aangemaakt worden
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 01/12/2014
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
     * In deze methode worden de artikelen bij de artikelnamen gezocht
     * en worden deze aan het dienblad van het meegegeven persoon gekoppelt
     * indien deze persoon een dienblad heeft.
     * Als het meegegeven persoon minstens 1 artikel op het dienblad heeft,
     * sluit deze persoon achteraan in de rij.
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        
        Dienblad dienblad = persoon.getDienblad();
        if(dienblad != null){
            for(int i = 0;i < artikelnamen.length; i++){
                Artikel artikel = kantineaanbod.getArtikel(artikelnamen[i]);
                if(artikel != null){
                    dienblad.voegToe(artikel);
                }
            }
            if(dienblad.getAantalArtikelen() > 0){
                kassarij.sluitAchteraan(persoon);
            }
        }
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
