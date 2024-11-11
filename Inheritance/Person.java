public class Person 
{
private String fname;
private String lname;
private int age;

    // constructor
    public Person(String fname, String lname, int age)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    // getters and setters
    public String getFName()
    {
        return fname;
    }
    public void setFName(String fname)
    {
        this.fname = fname;
    }
    public String getLName()
    {
        return lname;
    }
    public void setLName(String lname)
    {
        this.lname = lname;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    // methods
    public static void Eat()
    {
        System.out.println("Eating...");
    }
    public static void Sleep()
    {
        System.out.println("Sleeping...");
    }
    public static void Talk()
    {
        System.out.println("Talking...");
    }
}
