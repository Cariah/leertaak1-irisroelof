
/**
 * Write a description of class Artikel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    /*
     * Constructor for objects of class Artikel
     * @param String naamArtikel
     * @param double prijsArtikel
     */
    public Artikel(String naamArtikel, double prijsArtikel)
    {
        naam = naamArtikel;
        prijs = prijsArtikel;
    }
    
    public String getNaam()
    {
        return this.naam;
    }
    
    public double getPrijs()
    {
        return this.prijs;
    }
    
    public void setNaam(String naamArtikel)
    {
        naam = naamArtikel;
    }
    
    public void setPrijs(Double prijsArtikel)
    {
        prijs = prijsArtikel;
    }

}
