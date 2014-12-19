
/**
 * class Docent
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 8-12-2014
 */
public class Docent extends Persoon implements KortingskaartHouder
{
    // instance variables - replace the example below with your own
    private String afkorting;
    private String afdeling;
    private static final int MAX_KORTING = 1;
    private static final boolean HEEFT_MAX_KORTING = true;
    private static final double KORTINGS_PERCENTAGE = 0.25;

    /**
     * Constructor for objects for class Docent
     */
    public Docent()
    {
        super();
        setAfkorting("Onbekend");
        setAfdeling("Onbekend");
    }

    /**
     * Constructor for objects of class Docent
     * @param afkorting - de afkorting van de docent
     * @param afdeling - de afdeling van de docent
     * @param bsn - het bsn-nummer van de docent
     * @param voornaam - de voornaam van de docent
     * @param achternaam - de achternaam van de docent
     * @param geslacht - het geslach van de docent
     * @param dag - de geboortedag van de docent
     * @param maand - de geboortemaand van de docent
     * @param jaar - het geboortejaar van de docent
     */
    public Docent(String afkorting, String afdeling, String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
    }

    /**
     * Retourneerd de afkorting van de docent
     * @return de afkorting van de docent
     */
    public String getAfkorting()
    {
        return afkorting; 
    }

    /**
     * Retourneerd de afdeling van de docent
     * @return de afdeling van de docent
     */
    public String getAfdeling()
    {
        return afdeling;
    }

    /**
     * Wijzigt de afkorting van de docent
     * @param afkorting - de nieuwe afkorting van de docent
     */
    public void setAfkorting(String afkorting)
    {
        this.afkorting = afkorting;
    }

    /**
     * Wijzigt de afdeling van de docent
     * @param afdeling - de nieuwe afdeling van de docen
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
     * Implementeerd de geefMaximum methode uit de Interface KortingskaartHouder
     * @return double De maximale korting die mag worden gegeven.
     */
    public double geefMaximum(){
        return MAX_KORTING;
    }
    
    /**
     * Implementeerd de heeftMaximum methode uit de Interface KortingskaartHouder
     * @return boolean Of docent een maximum korting heeft of niet. (true/false)
     */
    public boolean heeftMaximum()
    {
        return HEEFT_MAX_KORTING;
    }
    
    /**
     * Implementeerd de geefKortingsPercentage methode uit de Interface KortingskaartHouder
     * @return double Kortingspercentage van de Docent
     */
    public double geefKortingsPercentage(){
        return KORTINGS_PERCENTAGE;
    }

    /**
     * Drukt alle informatie van de docent af
     */
    public void drukAf()
    {
        System.out.println("#####");
        System.out.println("# Afkorting: " + getAfkorting());
        System.out.println("# Afdeling: " + getAfdeling());
        System.out.println("#####");
    }

    /**
     * toString voor Docent
     * @return String Docent als string
     */
    public String toString()
    {
        StringBuilder zin = new StringBuilder();
        zin.append(super.toString());
        zin.append("Afkorting: ").append(getAfkorting()).append("\n");
        zin.append("Afdeling: ").append(getAfdeling()).append("\n");
        
        return zin.toString();
    }
}

