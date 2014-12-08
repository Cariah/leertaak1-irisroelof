
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Persoon
{
    // instance variables - replace the example below with your own
    private String studentnummer;
    private String studierichting;

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentnummer, String studierichting, String bsn, String voornaam, String achternaam, char geslacht,
    int dag, int maand, int jaar)
    {

        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        this.studentnummer = studentnummer;
        this.studierichting = studierichting;
    }

    public String getStudentnummer()
    {
        return studentnummer;
    }

    public String getStudierichting()
    {
        return studierichting;
    }

    public void setStudentnummer(String studentnummer)
    {
        this.studentnummer = studentnummer;
    }

    public void setStudierichting(String studierichting)
    {
        this.studierichting = studierichting;
    }

}
