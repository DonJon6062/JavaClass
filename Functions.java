import java.util.Scanner;

public class Functions {
    public static void main(String[] args)
    {
        //display title
        Title();
        //display intro
        Intro();
    }

    //method to send the user to the next part of the story
    //public static void plotline(String destination)
    //{
        //battle
      //  String playerChoice = " ";
        //while loop to keep game going until user wants to stop
        //while(!playerChoice.equals("Exit"))
        //{
          //  if(playerChoice.equals("prepareForAdventure"))
            //{
              //  playerChoice = prepareForAdventure();
            //}
            //else
            //{
              //  firstBattle();
            //}
        //}

    //}

    public static void Title()
    {
        System.out.println("Welcome to Auspicious Pancopticon!\n");
    }
// fighting monsters in what is essentially a reality show
    public static void Intro()
    {
        System.out.println("One day, monsters began appearing, threatening the way of life.");
        System.out.println("Combatants, to bolster the population and show their victories, recorded their travels.");
        System.out.println("The populus was able to watch their victories, their failures, their trials and tribulations.");
        System.out.println("Eventually it was customary, to show the battle, to become a legend of the people.");
        System.out.println("The people continued watching. Started betting. It became entertainment.");
        System.out.println("It became profitable. The impovershed began to throw themselves at the monsters for a few bucks.");
        System.out.println("Now, you too, wage your life for payout.");
        setupCharacter();
    }

    public static String setupCharacter()
    {
        //get ready for input
        Scanner scan = new Scanner(System.in);
        //prompt input
        System.out.println("Who are you, exactly?");
        //prompt input
        String name = scan.nextLine();
        //greet user by name
        System.out.println(name+", eh? Good luck out there.");
        //close scanner
        scan.close();
        //prepForBattle
        prepareForAdventure();
        //return string
        return name;
    }

    public static String prepareForAdventure()
    {
        //String weaponChoice = " ";
        //make scanner
        Scanner scan = new Scanner(System.in);
        //offer some weapons
        System.out.println("Despite it being a death show, there are still standards that require compliance. The corporation that is providing you with your own free recording drone had an entire registration process. At the end they even gave you a goodie bag with starter gear.");
        System.out.println(" It's lacking in nearly every way, as new blood is required at a breakneck pace and the only thing they actually consider is how fun it would be to watch you fight and the starter gear may as well be made of cardboard, but it's something. Arguably better than nothing. ");
        //present choices
        System.out.println("Which beginners goodie bag do *you* want?");
        System.out.println("\n1. Sword and Shield. Shortest range, but comes with some defense. Useful for piercing or slashing damage. Appear to be returned, however, drom the dents already present.");
        System.out.println("\n2. Throwing Knives. Furthest range, but needs a good eye. Useful for piercing damage. Rusted orange.");
        System.out.println("\n3. Staff. Has some range, does good blunt damage. Useful when surrounded. Not the best ever built, by looks alone.");
        System.out.println("\n4. Exit the game.");
        //prompt input
        System.out.println("\nEnter your choice: (1, 2 , 3 or 4)");
        //scan the next line
        String weaponChoice = scan.nextLine();
        //make a variable to store the input
        String playerChoice = " ";
        //confirm choice
        if(weaponChoice.equals("1"))
        {
            playerChoice = "Sword and Shield";
            System.out.println("\nYou now have a really bad Sword and Shield!");
        }
        else if(weaponChoice.equals("2"))
        {
            playerChoice = "Throwing Knives";
            System.out.println("\nYou now have really bad Throwing Knives!");
        }
        else if(weaponChoice.equals("3"))
        {
            playerChoice = "Staff";
            System.out.println("\nYou now have really bad Staff!");
        }
        else if(weaponChoice.equals("4"))
        {
            System.out.println("\nBye!");
            playerChoice = "Exit";
        }
        else
        {
            System.out.println("\nPlease don't enter an invalid choice.");
            playerChoice = "prepareForAdventure";
        }
        //close scanner
        scan.close();
        return playerChoice;
    }

    public static void firstBattle()
    {
        System.out.println("The recording drone hovers behind you, silently, at a height that was likely determined to be safe for it to fly at. It's free to use, not disposable. ");
    }
}
