import java.util.ArrayList;

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
        //method body omitted
        personen.add(persoon);
    }

    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        //method body omitted
        // if iemand in de rij return persoon;
        if(erIsEenRij()){
            return personen.get(0);
        } else {
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        return personen.size() > 0;
    }
}
