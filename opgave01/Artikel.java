
/**
 * Met deze klasse worden artikelen aangemaakt
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 19/11/2014
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private String naam;
    private double prijs;
    
    /**
     * Constructor for objects of class Artikel
     */
    public Artikel()
    {
        // initialise instance variables
        naam = "Nieuw Artikel";
        prijs = 0;
    }
    
    /**
     * Constructor for objects of class Artikel
     * @param String naam
     * @param double prijs
     */
    public Artikel(String naam, double prijs)
    {
        this.naam = naam;
        this.prijs = prijs;
    }
    
    /**
     * Getter voor de Naam
     * @return naam
     */
    public String getNaam()
    {
        return this.naam;
    }
    
    /**
     * Getter voor de Prijs
     * @return prijs
     */
    public double getPrijs()
    {
        return this.prijs;
    }
    
    /**
     * Deze methode drukt de instantievariabelen af
     */
    public void drukAf()
    {
        System.out.println("######");
        System.out.println("# Naam:  " + getNaam());
        System.out.println("# Prijs: " + getPrijs());
        System.out.println("######");
    }
    
    /**
     * Setter voor de naam
     * @param naam Naam van het Artikel
     */
    public void setNaam(String naam)
    {
        this.naam = naam;
    }
    
    /**
     * Setter voor de prijs
     * @param prijs Prijs van het Artikel
     */
    public void setPrijs(Double prijs)
    {
        this.prijs = prijs;
    }

}
