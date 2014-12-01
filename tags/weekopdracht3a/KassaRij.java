import java.util.LinkedList;

/**
 * KassaRij class
 * Met de klasse Kassarij kunnen er kassarijen aangemaakt worden
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 25/11/2014
 */
public class KassaRij {

    // Declareren van de variabelen
    // Bij opgave 3 was dit een ArrayList<Persoon>
    // Maar bij opgave 7 moest dit worden 
    // veranderd naar een LinkedList<Persoon>
    private LinkedList<Persoon> personen;

    /**
     * Default Constructor
     */
    public KassaRij() {
        // Initialiseren van de variabelen
        personen = new LinkedList<Persoon>();
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) {
        personen.add(persoon);
    }

    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        // if 'iemand in de rij' return persoon anders null
        if(erIsEenRij()){
            return personen.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat (true/false)
     */
    public boolean erIsEenRij() {
        return personen.size() > 0;
    }
    
}
