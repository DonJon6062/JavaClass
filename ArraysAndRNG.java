// import needed libraries
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArraysAndRNG 
{
 
//  main function
    public static void main(String[] args) 
    {
        Intro();
    }

    // get the program started
    public static void Intro()
    {
        System.out.println("This is the Housing Application. It will assign empty rooms to awaiting colonists of our Mars base!");
        Start();
    }

    // begin the core functionlity
    public static void Start()
    {
        // prompt and recieve input
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you here? (Y or N, Uppercase please!)");
        String choice  = scan.nextLine();
        
        if(choice.equals("Y"))
        {
            // start program
            // rooms
            int[] Rooms = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            // people
            String[] People = {" John ", " James "," Charlie "," Pam "," Angus "," Reuben "," Lisa "," Sadie "," Anya "," Leslie "};
            // available/unavailable rooms
            String[] roomCheck = {" U ", " U "," U "," U "," U "," U "," U "," U "," U "," U "};
            System.out.println("There are " + Arrays.toString(Rooms) + " rooms, and the awaiting colonists are " + Arrays.toString(People) );
           
            //var for every person
            int peopleWaiting = People.length;
            // var for all rooms
            int emptyRooms = Rooms.length;

            // place people in rooms
            for(int i = 0; i < peopleWaiting; i++)
            {
                 // add rng
                Random randomizeRooms = new Random();
                // generate room number
                int roomNumber = randomizeRooms.nextInt(emptyRooms);
                // check if room has been assigned
                while(roomCheck[roomNumber] == "A")
                {
                    // reroll
                    roomNumber = randomizeRooms.nextInt(emptyRooms);
                }
                // make room assigned
                roomCheck[roomNumber] = "A";
                // remove empty value from array
                emptyRooms = Rooms.length;
                // assign person to room
                System.out.println("\nAssigning " + People[i] + " to " + Rooms[roomNumber]);
            }
        }
        else if(choice.equals("N"))
        {
            System.out.println("Gotcha.");
            // lying is bad
            for(int i = 0; i < 100; i++)
            {
                System.out.println("Lying is bad!\n");
            }
            Start();
        }
        else
        {
            // catch invalids, like lowercases
            System.out.println("Please use a valid response."); 
            Start();
        }
        scan.close();
    }
}
