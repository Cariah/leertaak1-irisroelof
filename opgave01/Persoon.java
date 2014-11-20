
/**
 * Write a description of class Persoon here.
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 19/11/2014
 */
public class Persoon
{
    // Declareren van de Variabelen
    private String bsn;
    private String voornaam;
    private String achternaam;
    private char geslacht;
    private int dag;
    private int maand;
    private int jaar;

    //iris
    /**
     * Constructor voor objecten van class Persoon
     */
    public Persoon()
    {
        // Initialiseren van de variabelen
        bsn = "Burgerservicenummer";
        voornaam = "Voornaam";
        achternaam = "Achternaam";
        geslacht = 'M';
        dag = 1;
        maand = 1;
        jaar = 2000;
    }

    /**
     * Constructor voor objecten van class Persoon
     * @param bsn   Burgerservicenummer
     * @param voornaam Voornaam
     * @param achternaam Achternaam
     * @param geslacht  Geslacht
     * @param dag   Dag van de geboortedatum
     * @param maand Maand van de geboortedatum
     * @param jaar  Jaar van de geboortedatum
     */
    public Persoon(String bsn, String voornaam, String achternaam, char geslacht,
        int dag, int maand, int jaar)
    {

        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geslacht = geslacht;
        // Gebruik maken van setGeboortedatum() om de datum te "setten"
        setGeboortedatum(dag, maand, jaar);
    }

    /**
     * Getter voor bsn
     * @return Burgerservicenummer
     */
    public String getBsn()
    {
        return bsn;
    }

    /**
     * Getter voor voornaam
     * @return Voornaam
     */
    public String getVoornaam()
    {
        return voornaam;
    }

    /**
     * Getter voor achternaam
     * @return Achternaam
     */
    public String getAchternaam()
    {
        return achternaam;
    }

    /**
     * Getter voor geboortedatum
     * @return Geboortedatum
     */
    public String getGeboortedatum()
    {
        String temp;
        if(dag==0 && maand==0 && jaar==0)
        {
            temp = "Onbekend";
        } else {
            temp = dag + "/" + maand + "/" + jaar;
        }
        return temp;
    }

    /**
     * Getter voor geslacht
     * @return Geslacht
     */
    public String getGeslacht()
    {
        String temp;
        switch(geslacht)
        {
            // Check of geslacht 'm' of 'M' is
            case 'm':
            case  'M':
            temp = "Man";
            break;
            // Check of geslacht 'v' of 'M' is
            case 'v':
            case 'V':
            temp = "Vrouw";
            break;
            // Als char dus geen m / M of v / V is dan is het geslacht Onbekend
            default:
            temp = "Onbekend";
            break;
        }
        return temp;
    }
    
    /**
     * Deze methode drukt de instantievariabelen af
     */
    public void drukAf()
    {
        System.out.println("#####");
        System.out.println("# BSN:\t\t\t" + getBsn());
        System.out.println("# Voornaam:\t\t" + getVoornaam());
        System.out.println("# Achternaam:\t\t" + getAchternaam());
        System.out.println("# Geslacht:\t\t" + getGeslacht());
        System.out.println("# Geboortedatum:\t" + getGeboortedatum());
        System.out.println("#####");
    }

    /**
     * Setter voor bsn
     * @param bsn Burgerservicenummer
     */
    public void setBsn(String bsn)
    {
        this.bsn = bsn;
    }

    /**
     * Setter voor geboortedatum
     * @param dag Dag van de geboorte
     * @param maand Maand van de geboorte
     * @param jaar Jaar van de geboorte
     */
    public void setGeboortedatum(int dag, int maand, int jaar)
    {

        // Checken of dag > 0
        if(!(dag > 0)){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        // Checken of maand ligt tussen 0 - 13
        if(!(maand > 0 && maand <= 12)){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        // Checken of jaar ligt tussen 1899 en 2101
        if(!(jaar >= 1900 && jaar <= 2100)){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        
        int maxDays;
        switch(maand)
        {
            case 2:
                // if schrikkeljaar maxDays = 29
                // als jaar deelbaar is door 4
                // en jaar deelbaar door 400
                // schrikkeljaar 
                if(jaar % 4 == 0 && !(jaar % 100 == 0) || jaar % 400 == 0)
                {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;
            default:
                maxDays = 30;
                break;
        }
        
        if(dag > maxDays)
        {
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        else {
            this.dag = dag;
            this.maand = maand;
            this.jaar = jaar;
        }
    }
}
