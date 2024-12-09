//import scanner
import java.util.Scanner;

//create class
public class Adventure 
{

static void golemType(int number)
{
    if(number == 1)
    {
        System.out.print(" a Dinosaur.");
    }
    if(number == 2)
    {
        System.out.print(" a Caveman.");
    }
    if(number == 3)
    {
        System.out.print(" a Warrior.");
    }
    if(number == 4)
    {
        System.out.print(" a Knight.");
    }
    if(number == 5)
    {
        System.out.print(" a Militiaman.");
    }
}

static boolean comboCheck(int unitOne, int unitTwo, int unitThree)
{
    boolean comboDone;
    // if an ascending order combo is complete or if the same unit has successfully been played thrice
    if(unitOne == 1 && unitTwo == 2 && unitThree == 3 || unitOne == 3 && unitTwo == 4 && unitThree == 5 || unitOne == unitTwo && unitTwo == unitThree) 
    {
       return comboDone = true;
    }
    else
    {
        return comboDone = true;
    }
}

    //make main 
    public static void main(String[] args) 
    {
        int playerPoints = 0; 
        int enemyPoints = 0;
        //vars for units
        int dinosaur = 1;//better than 5, 4 
        int caveman = 2;//better than 1, 3
        int warrior = 3;//better than 1, 4
        int knight = 4;//better than 5, 2
        int militiaman = 5;//better than 3, 2
       
        int playedGolem = 0; 
        int enemyGolem = 0;

        // monitors rounds played
        int roundNumber = 0;
        // monitors valid units played (must be a win)
        int validPlayerUnit = 0;
        int validEnemyUnit = 0;
        // vars to check for player combos
        int playerUnitOne = 0;
        int playerUnitTwo = 0;
        int playerUnitThree = 0;
        // vars to check for opponent combos
        int enemyUnitOne = 0;
        int enemyUnitTwo = 0;
        int enemyUnitThree = 0;

        //make scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("You and your friend have been arguing about what the best era of civilization was. As both of you are at a standstill, there is only one option that can satisfy both of your needs to be correct: battling. Not with fists and swords, no, with golems that represent the strongest soldiers of the era. After one of you proves your tactical prowess by beating the other thrice is when the other must accept that they were wrong. And you're obviously right.");
        while(true)
        {
            if(playerPoints < 3)
            {
                if(enemyPoints < 3)
                {
                    {
                        // set round number
                        roundNumber += 1;
                        System.out.println("Round " + roundNumber);
                        // print units currently registered\
                        System.out.println("You have recently played " + playerUnitOne + ", " + playerUnitTwo + ", " + playerUnitThree);
                        System.out.println("Your opponent has played " + enemyUnitOne + ", " + enemyUnitTwo + ", " + enemyUnitThree);
                        //player and enemy choice
                        System.out.println("What do you want to play?\n1.Dinosaur \n(Beats Militiaman and Knight, loses to Caveman and Warrior)\n2.Caveman \n(Beats Dinosaur and Warrior, loses to Knight and Militiaman)\n3.Warrior \n(Beats Dinosaur and Knight, loses to Caveman and Militiaman)\n4.Knight \n(Beats Caveman and Militiaman, loses to Dinosaur and Warrior)\n5.Militiaman \n(Beats Caveman and Warrior, loses to Dinosaur and Knight)\nPlaying three units in ascending order or descending order gives an instant win! So does playing the asme unit thrice!\nYou have to win a round wuth the unit for it to be valid, however! Your opponent can do the same!");
                        playedGolem = scan.nextInt();
                        int random = (int)(Math.random() * 5 + 1);
                        enemyGolem = random;
                    //Win/lose check and point allocation
                    if(enemyGolem == playedGolem)
                    {
                        System.out.println("It's a tie!");
                    }
                    else if(playedGolem == dinosaur)
                    {
                        if(enemyGolem == militiaman || enemyGolem == knight)
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You've won this round!");
                            playerPoints += 1;
                            
                            // combo check player
                            validPlayerUnit += 1;
                            // set the vars in order
                            if(validPlayerUnit == 1 || validPlayerUnit == 4 || validPlayerUnit == 7 || validPlayerUnit == 10 || validPlayerUnit == 13)
                            {
                                playerUnitOne = playedGolem;
                            }
                            if(validPlayerUnit == 2 || validPlayerUnit == 5 || validPlayerUnit == 8 || validPlayerUnit == 11 || validPlayerUnit == 14)
                            {
                                playerUnitTwo = playedGolem;
                            }
                            if(validPlayerUnit == 3 || validPlayerUnit == 6 || validPlayerUnit == 9 || validPlayerUnit == 12 || validPlayerUnit == 15)
                            {
                                playerUnitThree = playedGolem;
                            }
                            if(playerUnitOne != 0 && playerUnitTwo != 0 && playerUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(playerUnitOne, playerUnitTwo, playerUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given you an instant victory! Nice Job!");
                                    break;
                                }
                            }

                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                        else
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You lose this round!");
                            enemyPoints += 1;
                         
                            // combo check enemy
                            validEnemyUnit += 1;
                            // set the vars in order
                            if(validEnemyUnit == 1 || validEnemyUnit == 4 || validEnemyUnit == 7 || validEnemyUnit == 10 || validEnemyUnit == 13)
                            {
                                enemyUnitOne = enemyGolem;
                            }
                            if(validEnemyUnit == 2 || validEnemyUnit == 5 || validEnemyUnit == 8 || validEnemyUnit == 11 || validEnemyUnit == 14)
                            {
                                enemyUnitTwo = enemyGolem;
                            }
                            if(validEnemyUnit == 3 || validEnemyUnit == 6 || validEnemyUnit == 9 || validEnemyUnit == 12 || validEnemyUnit == 15)
                            {
                                enemyUnitThree = enemyGolem;
                            }
                            if(enemyUnitOne != 0 && enemyUnitTwo != 0 && enemyUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(enemyUnitOne, enemyUnitTwo, enemyUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given them an instant victory! How unfortunate!");
                                    break;
                                }
                            }

                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                    }
                    else if(playedGolem == caveman)
                    {
                        if(enemyGolem == dinosaur || enemyGolem == warrior)
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You've won this round!");
                            playerPoints += 1;

                            // combo check player
                            validPlayerUnit += 1;
                            // set the vars in order
                            if(validPlayerUnit == 1 || validPlayerUnit == 4 || validPlayerUnit == 7 || validPlayerUnit == 10 || validPlayerUnit == 13)
                            {
                                playerUnitOne = playedGolem;
                            }
                            if(validPlayerUnit == 2 || validPlayerUnit == 5 || validPlayerUnit == 8 || validPlayerUnit == 11 || validPlayerUnit == 14)
                            {
                                playerUnitTwo = playedGolem;
                            }
                            if(validPlayerUnit == 3 || validPlayerUnit == 6 || validPlayerUnit == 9 || validPlayerUnit == 12 || validPlayerUnit == 15)
                            {
                                playerUnitThree = playedGolem;
                            }
                            if(playerUnitOne != 0 && playerUnitTwo != 0 && playerUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(playerUnitOne, playerUnitTwo, playerUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given you an instant victory! Nice Job!");
                                    break;
                                }
                            }
                                                                                    
                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                        else
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You lose this round!");
                            enemyPoints += 1;
                            
                            // combo check enemy
                            validEnemyUnit += 1;
                            // set the vars in order
                            if(validEnemyUnit == 1 || validEnemyUnit == 4 || validEnemyUnit == 7 || validEnemyUnit == 10 || validEnemyUnit == 13)
                            {
                                enemyUnitOne = enemyGolem;
                            }
                            if(validEnemyUnit == 2 || validEnemyUnit == 5 || validEnemyUnit == 8 || validEnemyUnit == 11 || validEnemyUnit == 14)
                            {
                                enemyUnitTwo = enemyGolem;
                            }
                            if(validEnemyUnit == 3 || validEnemyUnit == 6 || validEnemyUnit == 9 || validEnemyUnit == 12 || validEnemyUnit == 15)
                            {
                                enemyUnitThree = enemyGolem;
                            }
                            if(enemyUnitOne != 0 && enemyUnitTwo != 0 && enemyUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(enemyUnitOne, enemyUnitTwo, enemyUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given them an instant victory! How unfortunate!");
                                    break;
                                }
                            }

                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                    }
                    else if(playedGolem == warrior)
                    {
                        if(enemyGolem == dinosaur || enemyGolem == knight)
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You've won this round!");

                            // combo check player
                            validPlayerUnit += 1;
                            // set the vars in order
                            if(validPlayerUnit == 1 || validPlayerUnit == 4 || validPlayerUnit == 7 || validPlayerUnit == 10 || validPlayerUnit == 13)
                            {
                                playerUnitOne = playedGolem;
                            }
                            if(validPlayerUnit == 2 || validPlayerUnit == 5 || validPlayerUnit == 8 || validPlayerUnit == 11 || validPlayerUnit == 14)
                            {
                                playerUnitTwo = playedGolem;
                            }
                            if(validPlayerUnit == 3 || validPlayerUnit == 6 || validPlayerUnit == 9 || validPlayerUnit == 12 || validPlayerUnit == 15)
                            {
                                playerUnitThree = playedGolem;
                            }
                            if(playerUnitOne != 0 && playerUnitTwo != 0 && playerUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(playerUnitOne, playerUnitTwo, playerUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given you an instant victory! Nice Job!");
                                    break;
                                }
                            }
                                                                                    
                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                        else
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You lose this round!");
                            enemyPoints += 1;
                            
                            // combo check enemy
                            validEnemyUnit += 1;
                            // set the vars in order
                            if(validEnemyUnit == 1 || validEnemyUnit == 4 || validEnemyUnit == 7 || validEnemyUnit == 10 || validEnemyUnit == 13)
                            {
                                enemyUnitOne = enemyGolem;
                            }
                            if(validEnemyUnit == 2 || validEnemyUnit == 5 || validEnemyUnit == 8 || validEnemyUnit == 11 || validEnemyUnit == 14)
                            {
                                enemyUnitTwo = enemyGolem;
                            }
                            if(validEnemyUnit == 3 || validEnemyUnit == 6 || validEnemyUnit == 9 || validEnemyUnit == 12 || validEnemyUnit == 15)
                            {
                                enemyUnitThree = enemyGolem;
                            }
                            if(enemyUnitOne != 0 && enemyUnitTwo != 0 && enemyUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(enemyUnitOne, enemyUnitTwo, enemyUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given them an instant victory! How unfortunate!");
                                    break;
                                }
                            }
                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                    }
                    else if(playedGolem == knight)
                    {
                        if(enemyGolem == militiaman || enemyGolem == caveman)
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You've won this round!");
                            playerPoints += 1;

                            // combo check player
                            validPlayerUnit += 1;
                            // set the vars in order
                            if(validPlayerUnit == 1 || validPlayerUnit == 4 || validPlayerUnit == 7 || validPlayerUnit == 10 || validPlayerUnit == 13)
                            {
                                playerUnitOne = playedGolem;
                            }
                            if(validPlayerUnit == 2 || validPlayerUnit == 5 || validPlayerUnit == 8 || validPlayerUnit == 11 || validPlayerUnit == 14)
                            {
                                playerUnitTwo = playedGolem;
                            }
                            if(validPlayerUnit == 3 || validPlayerUnit == 6 || validPlayerUnit == 9 || validPlayerUnit == 12 || validPlayerUnit == 15)
                            {
                                playerUnitThree = playedGolem;
                            }
                            if(playerUnitOne != 0 && playerUnitTwo != 0 && playerUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(playerUnitOne, playerUnitTwo, playerUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given you an instant victory! Nice Job!");
                                    break;
                                }
                            }
                                                                                    
                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                        else
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You lose this round!");
                            enemyPoints += 1;

                            // combo check enemy
                            validEnemyUnit += 1;
                            // set the vars in order
                            if(validEnemyUnit == 1 || validEnemyUnit == 4 || validEnemyUnit == 7 || validEnemyUnit == 10 || validEnemyUnit == 13)
                            {
                                enemyUnitOne = enemyGolem;
                            }
                            if(validEnemyUnit == 2 || validEnemyUnit == 5 || validEnemyUnit == 8 || validEnemyUnit == 11 || validEnemyUnit == 14)
                            {
                                enemyUnitTwo = enemyGolem;
                            }
                            if(validEnemyUnit == 3 || validEnemyUnit == 6 || validEnemyUnit == 9 || validEnemyUnit == 12 || validEnemyUnit == 15)
                            {
                                enemyUnitThree = enemyGolem;
                            }
                            if(enemyUnitOne != 0 && enemyUnitTwo != 0 && enemyUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(enemyUnitOne, enemyUnitTwo, enemyUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given them an instant victory! How unfortunate!");
                                    break;
                                }
                            }

                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                    }
                    else if(playedGolem == militiaman)
                    {
                        if(enemyGolem == caveman || enemyGolem == warrior)
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You've won this round!");
                            playerPoints += 1;

                                // combo check player
                                validPlayerUnit += 1;
                                // set the vars in order
                                if(validPlayerUnit == 1 || validPlayerUnit == 4 || validPlayerUnit == 7 || validPlayerUnit == 10 || validPlayerUnit == 13)
                                {
                                    playerUnitOne = playedGolem;
                                }
                                if(validPlayerUnit == 2 || validPlayerUnit == 5 || validPlayerUnit == 8 || validPlayerUnit == 11 || validPlayerUnit == 14)
                                {
                                    playerUnitTwo = playedGolem;
                                }
                                if(validPlayerUnit == 3 || validPlayerUnit == 6 || validPlayerUnit == 9 || validPlayerUnit == 12 || validPlayerUnit == 15)
                                {
                                    playerUnitThree = playedGolem;
                                }
                                if(playerUnitOne != 0 && playerUnitTwo != 0 && playerUnitThree != 0)
                                {
                                    boolean instaWin = comboCheck(playerUnitOne, playerUnitTwo, playerUnitThree);
    
                                    if(instaWin == true)
                                    {
                                        System.out.println("Tactical prowess has given you an instant victory! Nice Job!");
                                        break;
                                    }
                                }
                                                                                    
                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                        else
                        {
                            System.out.print("Your friend played ");
                            if(enemyGolem == 1)
                            {
                                System.out.print("a Dinosaur.");
                            }
                            if(enemyGolem == 2)
                            {
                                System.out.print("a Caveman.");
                            }
                            if(enemyGolem == 3)
                            {
                                System.out.print("a Warrior.");
                            }
                            if(enemyGolem == 4)
                            {
                                System.out.print("a Knight.");
                            }
                            if(enemyGolem == 5)
                            {
                                System.out.print("a Militiaman.");
                            };
                            System.out.println("You lose this round!");
                            enemyPoints += 1;

                            // combo check enemy
                            validEnemyUnit += 1;
                            // set the vars in order
                            if(validEnemyUnit == 1 || validEnemyUnit == 4 || validEnemyUnit == 7 || validEnemyUnit == 10 || validEnemyUnit == 13)
                            {
                                enemyUnitOne = enemyGolem;
                            }
                            if(validEnemyUnit == 2 || validEnemyUnit == 5 || validEnemyUnit == 8 || validEnemyUnit == 11 || validEnemyUnit == 14)
                            {
                                enemyUnitTwo = enemyGolem;
                            }
                            if(validEnemyUnit == 3 || validEnemyUnit == 6 || validEnemyUnit == 9 || validEnemyUnit == 12 || validEnemyUnit == 15)
                            {
                                enemyUnitThree = enemyGolem;
                            }
                            if(enemyUnitOne != 0 && enemyUnitTwo != 0 && enemyUnitThree != 0)
                            {
                                boolean instaWin = comboCheck(enemyUnitOne, enemyUnitTwo, enemyUnitThree);

                                if(instaWin == true)
                                {
                                    System.out.println("Tactical prowess has given them an instant victory! How unfortunate!");
                                    break;
                                }
                            }

                            System.out.println(playerPoints +" is your score! " + enemyPoints + " is their score!");
                        }
                    }
                }
            }
            else
            {
                System.out.println("You lost the game! Seems they were right, or using a chance based method to determine who's right is flawed. We may never know what line of reasoning is correct.");
                break;
            }
        }
        else
        {
            System.out.println("You win this round! You always knew that you were right!");
            break;
        }  
    }   
    scan.close();      
}
}