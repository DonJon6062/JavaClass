//import scanner to read user input
import java.util.Scanner;

//create a class, use same name as class file
public class SpaceX
{
    //create the main method, the entry point
    public static void main(String[] args)
    {
        //get ready for input
        Scanner scan = new Scanner(System.in);
        //prompt
        System.out.println("\nMight I ask for your name?");
        //variable for name, looks for input on teh next line of code
        String name = scan.nextLine();
        //greet user by name
        System.out.println("\nHello, " + name);
        //description of ship
        System.out.println("\nDepending upon your circadian rhythym, good morning, good afternoon or good evening!\n");
        System.out.println("Welcome to Starbase 13, the largest space cruise on the north end of the galaxy!\n");
        System.out.println("For those interested in semi-active, recreational activities, the lower deck features a swimming pool.\n");
        System.out.println("For those who are more interested in having a 'bite of grub', the middle level has our 22 hour buffet.\n");
        System.out.println("Two hours are dedicated to cleanup and the next day's setup and layout of different dishes.\n");
        System.out.println("The middle layer also has our world class exersize room, with features accomodating for any workout from yoga to martial arts.\n");
        System.out.println("Our top layer, as you have presumably become aware, has your suites. All 500 of them!\n");
    }
}