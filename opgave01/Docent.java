
/**
 * Write a description of class Docent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    public String getAfkorting()
    {
        return afkorting; 
    }

    public String getAfdeling()
    {
        return afdeling;
    }

    public void setAfkorting(String afkorting)
    {
        this.afkorting = afkorting;
    }

    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
}

