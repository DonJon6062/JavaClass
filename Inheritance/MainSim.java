// impost scanner
import java.util.Scanner;

public class MainSim
{
    public static void Greeting()
    {
        System.out.println("Welcome to SchoolSim! \nWould you like to be a teacher or a student?\n");
        System.out.println("1.Student, I want to learn!\n2.Teacher, I want to teach!");
    }
    public static void Setup()
    {
        //make scanner
        Scanner scan = new Scanner(System.in);
        //scan the next line
        String classChoice = scan.nextLine();
        //make a variable to store the input
        String playerChoice = " ";
        //confirm choice
        if(classChoice.equals("1"))
        {
            studentLife();
        }
       else if(classChoice.equals("2"))
        {
            playerChoice = "Teacher";
            System.out.println("\n Alright! You're now a teacher!");
        }
        else
        {
            System.out.println("\nSorry... that's not a valid input...");
            Setup();
        }
        //send user to correct loop
    }
    public static void Goodbye()
    {
        System.out.println("Thank you for coming to class!");
    }
    //the path of a student
    public static void studentLife()
    {
        //make scanner
        Scanner scan = new Scanner(System.in);
        //continue
        System.out.println("\nAlright! You're now a student!\nWe just need some info before you're ready to start learning.");
        //get first name
        System.out.println("\nWhat's your first name?");
        //scan the next line
        String firstName = scan.nextLine();
        //get last name
        System.out.println("\nWhat's your last name?");
        //scan the next line
        String lastName = scan.nextLine();
        //get age
        System.out.println("\nWhat's your age?");
        //scan the next line
        int age = scan.nextInt();
        //get student ID
        System.out.println("\nWhat's your student id?");
        //scan the next line
        int sID = scan.nextInt();
        while(true)
        {
            Student student = new Student(firstName, lastName, age, sID);
            //use methods
            System.out.println("\nTime to live life!\n1. Eat\n2.Sleep\n3.Talk\n4.Learn\n5.Leave");
            //get and process input
            String actionChoice = scan.nextLine();

            if(actionChoice.equals("1"))
            {
                student.Eat();
            }
            else if(actionChoice.equals("2"))
            {
                student.Sleep();
            }
            else if(actionChoice.equals("3"))
            {
                student.Talk();
            }
            else if(actionChoice.equals("4"))
            {
                student.Study();
            }
            else if(actionChoice.equals("5"))
            {
                break;
            }
            else
            {
                System.out.println("Sorry, that's a invalid input...");
            }
        }
    }
    //the path of a teacher
    public static void teacherLife()
    {
        //make scanner
        Scanner scan = new Scanner(System.in);
        //continue
        System.out.println("\nAlright! You're now a teacher!\nWe just need some info before you're ready to start teaching.");
        //get first name
        System.out.println("\nWhat's your first name?");
        //scan the next line
        String firstName = scan.nextLine();
        //get last name
        System.out.println("\nWhat's your last name?");
        //scan the next line
        String lastName = scan.nextLine();
        //get age
        System.out.println("\nWhat's your age?");
        //scan the next line
        int age = scan.nextInt();
        //get student ID
        System.out.println("\nWhat's the subject you teach?");
        //scan the next line
        String subject = scan.nextLine();
        while(true)
        {
            //make class
            Professor professor = new Professor(lastName, firstName, age, subject);
            //use methods
            System.out.println("\nTime to live life!\n1. Eat\n2.Sleep\n3.Talk\n4.Teach\n5.Leave");
            //get and process input
            String actionChoice = scan.nextLine();
            
            if(actionChoice.equals("1"))
            {
                professor.Eat();
            }
            else if(actionChoice.equals("2"))
            {
                professor.Sleep();
            }
            else if(actionChoice.equals("3"))
            {
                professor.Talk();
            }
            else if(actionChoice.equals("4"))
            {
                professor.Teach();
            }
            else if(actionChoice.equals("5"))
            {
                break;
            }
            else
            {
                System.out.println("Sorry, that's a invalid input...");
            }
        }
        scan.close();
    }
    public static void main(String[] args) 
    {
        //do intro
        Greeting();
        //start main game
        Setup();
        //end
        Goodbye();
    }
}
