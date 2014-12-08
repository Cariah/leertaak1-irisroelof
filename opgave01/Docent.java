
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
     * Constructor for objects of class Docent
     */
    public Docent(String afkorting, String afdeling, String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        this.afkorting = afkorting;
        this.afdeling = afdeling;
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
     * @return de afkorting van de docent
     */
    public String getAfdeling()
    {
        return afdeling;
    }

    /**
     * Wijzigt de afkorting van de docent
     * @param afkorting -  de nieuwe afkorting van de docent
     */
    public void setAfkorting(String afkorting)
    {
        this.afkorting = afkorting;
    }

    /**
     * Wijzigt de afdeling van de docent
     * @param afdeling -  de nieuwe afdeling van de docen
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
}

