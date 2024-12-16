public class enemyChoices 
{
    public int descision = (int)(Math.random() * 5 + 1);
    public int opponentChoice = 0;

    // simple choice making; generate a random number, with two possibe generations beating the previously played opponent choice
    int enemyChoice(int opponentChoice)
    {
        int choice = descision;
        if(opponentChoice != 0)
        {
            if(opponentChoice == 1)
            {
                // generate a number between 1 and 3 (2 and 3 beat 1; the 1 is a extra possibility)
                choice = (int)(Math.random() * 3 + 1);
                System.out.println("Opponent Descided!");
            }
            if(opponentChoice == 2)
            {
                // generate a number between 3 and 5
                choice = (int)(Math.random() * 5 + 3);
                System.out.println("Opponent Descided!");
            }
            if(opponentChoice == 3)
            {
                // generate a number between 5 and 2
                choice = (int)(Math.random() * 5 + 2);
                System.out.println("Opponent Descided!");
            }
            if(opponentChoice == 4)
            {
                // generate a number between 1 and 3
                choice = (int)(Math.random() * 3 + 1);
                System.out.println("Opponent Descided!");
            }
            if(opponentChoice == 5)
            {
                // generate a number between 1 and 4
                choice = (int)(Math.random() * 4 + 1);
                System.out.println("Opponent Descided!");
            }
        }
        return choice;
    }
}
