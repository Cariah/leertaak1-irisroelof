
/**
 * Administratie Class
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 05/12/2014
 */
public class Administratie {

    /**
     * Private Constructor for Administratie
     */
    private Administratie()
    {
        // Private constructor,
        // zo kunnen we dit object niet meer instantiëren
    }

    /**
     * Deze methode berekent van de int array aantal de
     * gemiddelde waarde
     * @param aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        int lengtearray = aantal.length;
        double som=0;
        for(int i=0;i<lengtearray;i++){
            som += aantal[i];
        }
        return som/lengtearray;
    }

    /**
     * Deze methode berekent van de double array omzet de
     * gemiddelde waarde
     * @param omzet
     * @return Het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        int lengtearray = omzet.length;
        double som = 0;
        for(int i = 0;i<lengtearray; i++){
            som += omzet[i];
        }
        return som/lengtearray;
    }

    /**
     * Methode om dagomzet uit te rekenen
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */
    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[7];
        for(int i = 0; i < 7; i++) {
            int j = 0;
            while(omzet.length > (i+7*j)) {
                temp[i]+=omzet[i+7*j];
                j++;
            }
        }
        return temp;
    }

}
