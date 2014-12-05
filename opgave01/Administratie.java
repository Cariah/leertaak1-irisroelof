public class Administratie
{
    private Administratie()
    {
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
    
    public static void test(){
        double[] test = {50.25, 20.25, 70.25, 50.25, 20.25, 70.25, 10, 50.25, 20.25, 70.25, 50.25, 20.25, 70.25, 10};
        for(Double d : berekenDagOmzet(test))
        {
            System.out.println(d);   
        }
    }

}
