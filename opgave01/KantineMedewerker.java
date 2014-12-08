
/**
 *  class KantineMedewerker
 * 
 * @author Roelof Kallenkoot
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon
{
    // Instantievariabelen
    private String medewerkersnummer;
    private boolean magAchterKassa;

    /**
     * Constructor for objects of class KantineMedewerker
     * @param medewerkersnummer
     * @param magAchterKassa
     */
    public KantineMedewerker(String medewerkersnummer, boolean magAchterKassa)
    {
        // initialise instance variables
        this.medewerkersnummer = medewerkersnummer;
        this.magAchterKassa = magAchterKassa;
    }

    /**
     * Retourneerd het medewerkersnummer
     * @return medewerkersnummer
     */
    public String getMedewerkersnummer()
    {
        return medewerkersnummer;
    }
    
    /**
     * Retourneerd of de Kantinemedewerker achter de kassa mag of niet
     * @return magAchterKassa
     */
    public boolean getMagAchterKassa()
    {
        return magAchterKassa;
    }
    
    /**
     * Setter voor het medewerkernummer
     * @param Medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer = medewerkersnummer;
    }
    
    /**
     * Setter voor magAchterKassa
     * @param MagAchterKassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
    }
}
