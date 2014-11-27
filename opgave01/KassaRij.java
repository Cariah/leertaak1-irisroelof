import java.util.ArrayList;

/**
 * KassaRij class
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 25/11/2014
 */
public class KassaRij {

    // Declareren van de variabelen
    private ArrayList<Persoon> personen;

    /**
     * Constructor
     */
    public KassaRij() {
        // Initialiseren van de variabelen
        personen = new ArrayList<Persoon>();
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
        // if iemand in de rij return persoon;
        if(erIsEenRij()){
            return personen.get(0);
        } else {
            return null;
        }
    }
    
    /**
     * Verwijderd het eerste persoon uit de rij
     */
    public void verlaatKassaRij()
    {
        personen.remove(0);
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat (true/false)
     */
    public boolean erIsEenRij() {
        return personen.size() > 0;
    }
    
}
