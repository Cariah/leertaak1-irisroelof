
import org.junit.Assert;
import org.junit.Test;

/**
 * The test class AdministratieTest.
 *
 * @author  Roelof Kallenkoot
 * @version 08/12/2014
 */
public class AdministratieTest
{
    /**
     * Default constructor for test class AdministratieTest
     */
    public AdministratieTest()
    {
        
    }
    
    @Test
    public void testBerekenDagOmzet()
    {
        double[] testOmzet = {
                50.25, 20.25, 70.25, 50.25, 20.25, 70.25, 10,
                50.25, 20.25, 70.25, 50.25, 20.25, 70.25, 10};

        double[] expected = {100.5, 40.5, 140.5,100.5,40.5,140.5,20};

        Assert.assertArrayEquals(expected, Administratie.berekenDagOmzet(testOmzet),0.0001);
    }

    @Test
    public void testBerekenGemiddeldAantal()
    {
        int[] testAantal = {15,5,3,2,1,5,6};
        double expected = 5.2857142857;
        Assert.assertEquals(expected, Administratie.berekenGemiddeldAantal(testAantal), 0.0001);
    }

    @Test
    public void testBerekenGemiddeldeOmzet()
    {
        double[] testOmzet = {20.55, 50.27, 100.34, 20, 40, 100.63};
        double expected = 55.298333333;
        Assert.assertEquals(expected, Administratie.berekenGemiddeldeOmzet(testOmzet), 0.0001);
    }
}

