import java.util.Random;

/**
 * Class vooor de KantineSimulatie
 * Met deze klasse wordt een kantine gesimuleerd
 *
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 27/11/2014
 */

public class KantineSimulatie {
    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;

    // bestel niveau artikelen
    private static final int BESTEL_NIVEAU = 100;

    // artikelen
    private static final String[] artikelnamen=
        new String[] {"Koffie","Broodje hamburger", "Broodje kaas", "Melk"};

    // prijzen
    private static double[] artikelprijzen=
        new double[]{1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10000;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20000;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     */
    public KantineSimulatie(){
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden = getRandomArray(
                AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);

        kantineaanbod = new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden);
        kantine.setKantineAanbod(kantineaanbod);
    }

    /**
     * Methode om een array van random getallen liggend tussen min en max
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for(int i=0;i < lengte;i++) {
            temp[i] = getRandomValue(min, max);
        }
        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max-min+1)+min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijbehorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];
        for(int i=0;i < indexen.length;i++) {
            artikelen[i] = artikelnamen[indexen[i]];
        }
        return artikelen;
    }

    /**
     * Methode om op basis van een array van indexen voor de array van artikelprijzen
     * de bijbehorende array van artikelprijzen te maken
     * @param indexen
     * @return de array met artikelprijzen
     */
    private double[] geefArtikelPrijzen(int[] indexen) {
        double[] prijzen = new double[indexen.length];
        for(int i = 0; i< indexen.length; i++)
        {
            prijzen[i] = artikelprijzen[indexen[i]];
        }
        return prijzen;
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) {
        // totaal aantal personen gepasseerd
        int totaalAantalPersonen = 0;

        // for lus voor dagen
        for(int i=0; i < dagen;i++) {
            // bedenk hoeveel personen vandaag binnen lopen

            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
            // laat de personen maar komen...
            for(int j=0;j < aantalpersonen;j++) {
                // maak persoon en dienblad aan, koppel ze
                Persoon persoon = new Persoon();
                Dienblad dienblad = new Dienblad();
                persoon.pakDienblad(dienblad);

                // bedenk hoeveel artikelen worden gepakt
                int gepakteartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                // genereer de “artikelnummers”, dit zijn indexen
                // van de artikelnamen array
                int[] tepakken = getRandomArray(gepakteartikelen, 0, AANTAL_ARTIKELEN-1);

                // vind de artikelnamen op basis van
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);
                double[] artikelPrijzen = geefArtikelPrijzen(tepakken);

                // Check artikelvoorraad
                for(int a = 0; a < artikelen.length; a++){
                    int artikelvoorraad = kantineaanbod.getArtikelVoorraad(artikelen[a]);
                    
                    if(artikelvoorraad <= BESTEL_NIVEAU){
                        // Voorraad aanpassen
                        int voorraad = getRandomValue(MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);

                        kantineaanbod.setArtikelVoorraad(
                            new Artikel(artikelen[a], artikelPrijzen[a]), voorraad);
                    }
                }

                // loop de kantine binnen, pak de gewenste
                // artikelen, sluit aan
                kantine.loopPakSluitAan(persoon, artikelen);
            }
            kantine.verwerkRijVoorKassa();

            totaalAantalPersonen += aantalpersonen;
            Kassa kassa = kantine.getKassa();

            // Druk de dagtotalen af
            System.out.println("Hoeveelheid personen vandaag gepasseerd: " + aantalpersonen);
            System.out.println("Hoeveelheid geld in Kassa: " + kassa.hoeveelheidGeldInKassa());
            System.out.println("Hoeveelheid artikelen gepasseerd: " + kassa.aantalArtikelen());
            System.out.println();
            // Reset de waardes van de Kassa.
            kassa.resetKassa();
            // verwerk rij voor de kassa
            // druk de dagtotalen af en hoeveel personen binnen
            // zijn gekomen
            // reset de kassa voor de volgende dag
        }
        System.out.println("Hoeveelheid personen gepasseerd: " + totaalAantalPersonen);
        System.out.println();
    }

}
