
/**
 * class Docent
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 8-12-2014
 */
public class Docent extends Persoon
{
    // instance variables - replace the example below with your own
    private String afkorting;
    private String afdeling;

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
}

