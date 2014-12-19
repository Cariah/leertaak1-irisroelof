
/**
 * TeWeinigGeldException class
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot 
 * @version 19/12/2014
 */
public class TeWeinigGeldException extends Exception
{
    private String message;
    
    public TeWeinigGeldException()
    {

    }

    public TeWeinigGeldException(Exception e)
    {
        
    }

    public TeWeinigGeldException(String message)
    {
        this.message = message;
    }
}
