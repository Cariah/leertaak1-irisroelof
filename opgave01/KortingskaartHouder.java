
/**
 * interface KortingskaartHouder
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 16/12/2014
 */
public interface KortingskaartHouder
{

    // methode om kortingspercentage op te vragen
    public double geefKortingsPercentage();

    // methode om op te vragen of er maximum per keer aan de korting zit
    public boolean heeftMaximum();

    // methode om het maximum kortingsbedrag op te vragen
    public double geefMaximum();

}
