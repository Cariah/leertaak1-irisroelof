import java.util.Random;

/**
 * Class vooor de KantineSimulatie
 * Met deze klasse wordt een kantine gesimuleerd
 *
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 09/12/2014
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

    // maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 1;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;
    
    // Percentages voor het maken "random" Persoon objecten
    private static final double STUDENT_KANS_PERC = 0.89;
    private static final double DOCENT_KANS_PERC = 0.99;
    

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

        int[] aantalArtikelen = new int[dagen];
        double[] hoeveelheidInKassa = new double[dagen];

        // for lus voor dagen
        for(int i=0; i < dagen;i++) {
            // bedenk hoeveel personen vandaag binnen lopen

            int aantalpersonen = MAX_PERSONEN_PER_DAG;

            // laat de personen maar komen...
            for(int j=0;j < aantalpersonen ;j++) {
                Persoon persoon;

                // Opgave 4
                int random = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);

                if(random <= MAX_PERSONEN_PER_DAG * STUDENT_KANS_PERC){
                    persoon = new Student();
                }
                else if(random > MAX_PERSONEN_PER_DAG * STUDENT_KANS_PERC && random <= MAX_PERSONEN_PER_DAG * DOCENT_KANS_PERC){
                    persoon = new Docent();
                }
                else if(random > MAX_PERSONEN_PER_DAG * DOCENT_KANS_PERC) {
                    persoon = new KantineMedewerker();
                }
                else {
                    persoon = new Persoon();
                }

                // maak persoon en dienblad aan, koppel ze
                Dienblad dienblad = new Dienblad();
                Betaalwijze betaalwijze = new Pinpas();
                persoon.pakDienblad(dienblad);
                persoon.setBetaalwijze(betaalwijze);
                // bedenk hoeveel artikelen worden gepakt
                int gepakteartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                // genereer de “artikelnummers”, dit zijn indexen
                // van de artikelnamen array
                int[] tepakken = getRandomArray(gepakteartikelen, 0, AANTAL_ARTIKELEN-1);

                // vind de artikelnamen op basis van
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);
                double[] artikelPrijzen = geefArtikelPrijzen(tepakken);

                // loop de kantine binnen, pak de gewenste
                // artikelen, sluit aan
                kantine.loopPakSluitAan(persoon, artikelen);

                // Week 5 
                System.out.print(persoon.toString());
                System.out.println();
            }

            // Check artikelvoorraad aan het eind van de dag
            for(int a = 0; a < artikelnamen.length; a++){
                int artikelvoorraad = kantineaanbod.getArtikelVoorraad(artikelnamen[a]);

                if(artikelvoorraad <= BESTEL_NIVEAU){
                    // Voorraad aanpassen
                    int voorraad = getRandomValue(MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);

                    kantineaanbod.setArtikelVoorraad(
                        new Artikel(artikelnamen[a], artikelprijzen[a]), voorraad);
                }
            }

            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();

            totaalAantalPersonen += aantalpersonen;
            Kassa kassa = kantine.getKassa();

            aantalArtikelen[i] += kassa.aantalArtikelen();
            hoeveelheidInKassa[i] += kassa.hoeveelheidGeldInKassa();

            // Druk de dagtotalen af
            System.out.println("Hoeveelheid personen vandaag gepasseerd: " + aantalpersonen);
            System.out.println("Hoeveelheid geld in Kassa: " + kassa.hoeveelheidGeldInKassa());
            System.out.println("Hoeveelheid artikelen gepasseerd: " + kassa.aantalArtikelen());
            System.out.println();

            // Opgave 3f
            System.out.println("Gemiddeld aantal artikelen: " + Administratie.berekenGemiddeldAantal(aantalArtikelen));
            System.out.println("Gemiddelde omzet: " + Administratie.berekenGemiddeldeOmzet(hoeveelheidInKassa));

            double[] dagomzet = Administratie.berekenDagOmzet(hoeveelheidInKassa);
            for ( int x=0; x<dagomzet.length; x++)
            {
                System.out.println("Dagomzet: " + dagomzet[x]);
            }

            // Reset de waardes van de Kassa.
            kassa.resetKassa();

        }

        System.out.println("Hoeveelheid personen gepasseerd: " + totaalAantalPersonen);
        System.out.println();
    }

}
