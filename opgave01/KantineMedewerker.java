
/**
 *  class KantineMedewerker
 *
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 08/12/2014
 */
public class KantineMedewerker extends Persoon implements KortingskaartHouder
{
    // Instantievariabelen
    private String medewerkersnummer;
    private boolean magAchterKassa;
    
    private static final int MAX_KORTING = 0;
    private static final boolean HEEFT_MAX_KORTING = false;
    private static final double KORTINGS_PERCENTAGE = 0.35;


    public KantineMedewerker()
    {
        super();
        setMedewerkersnummer("Onbekend");
        setMagAchterKassa(false);
    }

    /**
     * Constructor for objects of class KantineMedewerker
     * @param medewerkersnummer
     * @param magAchterKassa
     */
    public KantineMedewerker(String medewerkersnummer, boolean magAchterKassa,String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        setMedewerkersnummer(medewerkersnummer);
        setMagAchterKassa(magAchterKassa);
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
     * @param String Medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer = medewerkersnummer;
    }

    /**
     * Setter voor magAchterKassa
     * @param boolean MagAchterKassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {
        this.magAchterKassa = magAchterKassa;
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
     * @return boolean Of kantinemedewerker een maximum korting heeft of niet. (true/false)
     */
    public boolean heeftMaximum()
    {
        return HEEFT_MAX_KORTING;
    }
    
    /**
     * Implementeerd de geefKortingsPercentage methode uit de Interface KortingskaartHouder
     * @return double Kortingspercentage van de Kantinemedewerker
     */
    public double geefKortingsPercentage(){
        return KORTINGS_PERCENTAGE;
    }
    
    /**
     * toString voor KantineMedewerker
     * @return String KantineMedewerker als string
     */
    @Override
    public String toString()
    {
        StringBuilder zin = new StringBuilder();
        zin.append(super.toString());
        zin.append("Medewekersnummer: ").append(getMedewerkersnummer()).append("\n");
        zin.append("Deze persoon mag achter de kassa: ").append(getMagAchterKassa()).append("\n");
        return zin.toString();
    }
}
