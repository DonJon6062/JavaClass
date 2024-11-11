// inherits person, learns
public class Student extends Person
{
    private int studentID;

    // constructor
    public Student(String fname, String lname, int age, int studentID)
    {
        super(fname, lname, age);
        this.studentID = studentID;
    }

    // getter and setter
    public int getSID()
    {
        return studentID;
    }
    public void setSID(int studentID)
    {
        this.studentID = studentID;
    }

    // unique method
    public void Study()
    {
        System.out.println("Studying...");
    }


}
