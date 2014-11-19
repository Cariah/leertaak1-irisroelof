
/**
 * Write a description of class Persoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private String bsn;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon()
    {
        // initialise instance variables
        bsn = "Burgerservicenummer";
        voornaam = "Voornaam";
        achternaam = "Achternaam";
        dag = 1;
        maand = 1;
        jaar = 2000;
        geslacht = 'M';
    }
    
    public Persoon(String bsn, String voornaam, String achternaam, 
        int dag, int maand, int jaar, char geslacht)
    {
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
        this.geslacht = geslacht;
    }
    
    public String getBsn()
    {
        return bsn;
    }
    
    public String getVoornaam()
    {
        return voornaam;
    }
    
    public String getAchternaam()
    {
        return achternaam;
    }
    
    public int getDag()
    {
        return dag;
    }
    
    public int getMaand()
    {
        return maand;
    }
    
    public int getJaar()
    {
        return jaar;
    }
    
    public String getGeboortedatum()
    {
        return dag + "/" + maand + "/" + jaar;
    }
    
    public void setGeboortedatum(int dag, int maand, int jaar)
    {
        // Checken of dag > 0
        if(!dag >= 1){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        // Checken of maand ligt tussen 1 - 12
        if(!maand > 0 && maand <= 12){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;        }
        // Checken of jaar ligt tussen 1900 en 2100
        if(!jaar >= 1900 && jaar <= 2100){
            this.dag = 0;
            this.maand = 0;
            this.jaar = 0;
        }
        
        // Kijken of de dagen kloppen met de maand
        
        
    }
    
    public char getGeslacht()
    {
        return geslacht;
    }
    
    
    
    

    
}
