
/**
 * Class Student
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
     */
    public Student()
    {
        super();
        setStudentnummer("Onbekend");
        setStudierichting("Onbekend");
    }

    /**
     * Constructor for objects of class Student
     * @param studentnummer Studentnummer
     * @param studierichting Studierichting
     * @param bsn Burgerservicenummer
     * @param voornaam Voornaam
     * @param achternaam Achternaam
     * @param geslacht Geslacht van de studenet
     * @param dag Dag van geboorte van de student
     * @param maand Maand van geboorte van de student
     * @param jaar Geboortejaar van de student
     */
    public Student(String studentnummer, String studierichting, String bsn, String voornaam,
    String achternaam, char geslacht, int dag, int maand, int jaar)
    {
        super(bsn,voornaam,achternaam,geslacht,dag,maand,jaar);
        setStudentnummer(studentnummer);
        setStudierichting(studierichting);
    }

    /**
     * Retourneerd het studentnummer
     * @return Studentnummer van de student
     */
    public String getStudentnummer()
    {
        return studentnummer;
    }

    /**
     * Retourneerd de studierichting van de student
     * @return Studierichting van de student
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

    /**
     * toString methode voor Student
     * @return String Student als string
     */
    @Override
    public String toString()
    {   
        StringBuilder zin = new StringBuilder();
        zin.append(super.toString());
        zin.append("Studentnummer: ").append(getStudentnummer()).append("\n");
        zin.append("Studierichting: ").append(getStudierichting()).append("\n");
        
        return zin.toString();
    }
}
