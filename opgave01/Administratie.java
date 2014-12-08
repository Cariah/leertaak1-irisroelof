
/**
 * Administratie Class
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 05/12/2014
 */
public class Administratie
{

    private static final int DAYS_IN_WEEK = 7;

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
        double[] temp=new double[DAYS_IN_WEEK];
        for(int i=0;i<DAYS_IN_WEEK;i++) {
            int j=0;
            while(omzet.length > (i+DAYS_IN_WEEK*j)) {
                temp[i]+=omzet[i+DAYS_IN_WEEK*j];
                //omitted
                j++;
            }
        }
        return temp;
    }

}
