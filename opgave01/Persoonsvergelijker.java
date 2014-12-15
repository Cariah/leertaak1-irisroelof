
/**
 * Write a description of class Persoonsvergelijker here.
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot
 * @version 15-12-2014
 */
public class Persoonsvergelijker
{
    public static void main(String[] args)
    {
        Persoon iris = new Persoon("123", "Iris", "Meijer", 'v', 20,06,1997);
        Persoon roelof = new Persoon("456", "Roelof", "Kallenkoot", 'm', 22,05,1995);

        System.out.println(iris.equals(roelof));
    }
}
