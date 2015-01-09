
/**
 * TeWeinigGeldException class
 * 
 * @author Iris Meijer
 * @author Roelof Kallenkoot 
 * @version 19/12/2014
 */
public class TeWeinigGeldException extends Exception
{
    /**
     * Default constructor
     */
    public TeWeinigGeldException()
    {
        super();
    }

    /**
     * Constructor voor TeWeinigGeldException
     * @param Exception e;
     */
    public TeWeinigGeldException(Exception e)
    {
        super(e.getMessage());
    }

    /**
     * Constructor voor TeWeinigGeldException
     * @param String message
     */
    public TeWeinigGeldException(String message)
    {
        super(message);
    }
}
