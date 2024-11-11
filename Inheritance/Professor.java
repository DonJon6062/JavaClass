// inherits person, teaches
public class Professor extends Person
{
    private String specialtySubject;

    // constructor
    public Professor(String fname, String lname, int age, String specialtySubject)
    {
        super(fname, lname, age);
        this.specialtySubject = specialtySubject;
    }

    // getter and setter
    public String getSubject()
    {
        return specialtySubject;
    }
    public void setAge(String specialtySubject)
    {
        this.specialtySubject = specialtySubject;
    }

    // unique method
    public void Teach()
    {
        System.out.println("Teaching...");
    }
}
