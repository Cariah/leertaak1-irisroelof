
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AdministratieTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AdministratieTest
{
    /**
     * Default constructor for test class AdministratieTest
     */
    public AdministratieTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
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
}

