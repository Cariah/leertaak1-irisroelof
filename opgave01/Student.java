
/**
 * class Student here
 * 
 * @author Roelof Kallenkoot
 * @author Iris Meijer
 * @version 08/12/2014
 */
public class Student extends Persoon
{
    // instance variables - replace the example below with your own
    private String studentnummer;
    private String studierichting;

    /**
     * Constructor for objects of class Student
     * @param Studentnummer
     * @param Studierichting
     * @param Burgerservicenummer
     * @param Voornaam
     * @param Achternaam
     * @param Geslacht van de studenet
     * @param Dag van geboorte van de student
     * @param Maand van geboorte van de student
     * @param Geboortejaar van de student
     */
    public Student(String studentnummer, String studierichting, String bsn, String voornaam, 
    String achternaam, char geslacht, int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        this.studentnummer = studentnummer;
        this.studierichting = studierichting;
    }

    /**
     * Retourneerd het studentnummer
     * @return Studentnummer
     */
    public String getStudentnummer()
    {
        return studentnummer;
    }
    
    /**
     * Retourneerd de studierichting van de student
     * @return Studierichting
     */
    public String getStudierichting()
    {
        return studierichting;
    }
    
    /**
     * Setter voor studentnummer
     * @param Studentnummer
     */
    public void setStudentnummer(String studentnummer)
    {
        this.studentnummer = studentnummer;
    }

    /**
     * Setter voor studierichting
     * @param Studierichting
     */
    public void setStudierichting(String studierichting)
    {
        this.studierichting = studierichting;
    }

}
