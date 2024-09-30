// impost scanner
 import java.util.Scanner;
// make class
public class ArrayGrid 
{
    // lowercase 'm' in main
    public static void main(String[] args)
    {
        // intro
        System.out.println("Welcome to the Energy Grid Manager!");
        System.out.println("This program aids in organization of power through the base. Let's begin.");
        // enable input
        Scanner input = new Scanner(System.in);
        //create variables
        int[] solarPanels = {5,15,25,35,45};
        int[] windTurbines = {10,20,30,40,50};
        // give solar sum 
        int totalSolar = calculateEnergy(solarPanels);
        // give turbine sum
        int totalWind = calculateEnergy(windTurbines);
        // give overall sum
        int allEnergy = totalSolar + totalWind;
        // display amounts
        System.out.println(totalSolar+" is the amount of megawatts given by the the solar panels! \n" +totalWind+" is the total amount of megawats given by the wind turbines!");
        System.out.println("The total overall energy provided is " + allEnergy + " megawatts.");
        // close scanner
        input.close();
    }
    // make function to calculate energy
    public static int calculateEnergy(int[] energySources)
    {
        // make variable to get sum
        int totalEnergy = 0;
        // add into variable all numbers in array
        // 
        for(int eachEnergySource : energySources)
        {
            totalEnergy = totalEnergy + eachEnergySource;
        }
        // give sum
        return totalEnergy;
    }
}