import java.util.HashMap;
import java.util.ArrayList;

/**
 * KantineAanbod class.
 *
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 01/12/2014
 */
public class KantineAanbod {

    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;

    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {

        aanbod = new HashMap<String, ArrayList<Artikel>>();

        for(int i = 0;i < artikelnaam.length;i++)
        {
            ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
            for(int j=0; j < hoeveelheid[i]; j++)
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /*
     * Private methode om de lijst van artikelen te krijgen op basis van de
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
        return aanbod.get(productnaam);
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken.
     * Retourneert null als de stapel leeg is.
     * @return Artikel
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel == null || stapel.size() == 0) {
            return null;
        } else {
            return stapel.remove(0);
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) {
        return getArtikel(getArrayList(naam));
    }

    /**
     * Publieke methode om de artikel voorraad te checken via de naam
     * @param String naam Naam van het artikel
     * @return int Artikel voorraad van gegeven artikel
     */
    public int getArtikelVoorraad(String naam){
        return getArrayList(naam).size();
    }

    /**
     * Publieke methode om de artikelvoorraad
     * van een artikel aan te passen.
     * @param Artikel artikel Een artikel.
     * @param hoeveelheid Hoeveelheid 
     */
    public void setArtikelVoorraad(Artikel artikel, int hoeveelheid){
        ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
        String artikelNaam = artikel.getNaam();
        for(int i = 0; i < hoeveelheid; i++){
            artikelen.add(new Artikel(artikel.getNaam(), artikel.getPrijs()));
        }
        if(artikelen.size() > 0){
            aanbod.put(artikelNaam, artikelen);
        }
    }
}
