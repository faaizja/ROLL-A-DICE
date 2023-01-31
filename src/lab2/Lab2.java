package lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2 {
	
	static Scanner scan = new Scanner(System.in); // initialize global scanner: "scan"
	
	
	public static void main (String[] args) 
	{ // main
		
		System.out.print("Enter your first name: ");
		String name = scan.nextLine();
		System.out.print("Thanks\n");
		
		System.out.println(" ");
		
		System.out.println("Press enter to roll the dices:");
		scan.nextLine();
			
		rollDice1(); // random number to dice 1
		rollDice2(); // random number to dice 2
		
		int dice1score = rollDice1(); // assign number on dice 1 to variable
		int dice2score = rollDice2(); // assign number on dice 2 to variable
		
		showDices(dice1score, dice2score); //display dices image
		
		Sum(dice1score, dice2score); // add up the numbers on dices 1 and 2
		int sum = Sum(dice1score, dice2score); // assign the value of the function to the variable
		
		oddOreven(sum); // use this function to figure out if the sum is odd or even
		boolean evenOdd = oddOreven(sum); // assign 
		
		displayName(name, evenOdd); // display name either upper case or lower case
		
	} // this bracket ends the main function
	
	
	
	public static int rollDice1() // roll dice function
	{
		Random rand = new Random();
		int dice1val = rand.nextInt(6) + 1; // get a random int between 1 and 6
		
		return dice1val;
		
	} // end roll dice1
	
	
	
	public static int rollDice2() // roll dice function
	{
		Random rand = new Random();
		int dice2val = rand.nextInt(6) + 1; // get a random int between 1 and 6
		
		return dice2val;
		
	} // end roll dice1
	
	
	
	public static void showDices(int dice1, int dice2) // image of dice function
	{
		String top = " *******\n";
		String middle = "|       |\n";
		String middle1 = "|       |\n";
		String bottom = " *******\n";
		
		System.out.print(top);
		System.out.print(middle);
		System.out.print("|   " + dice1 + "   |\n");
		System.out.print(middle1);
		System.out.print(bottom);
		
		System.out.print(top);
		System.out.print(middle);
		System.out.print("|   " + dice2 + "   |\n");
		System.out.print(middle1);
		System.out.print(bottom);
		
	} // end image function
	
	
	
	public static int Sum(int score1, int score2) // find the sum
	{
		int sum = score1 + score2;
		
		return sum;
	}
	
	
	
	public static boolean oddOreven(int Sum) // if odd, false. Else even
	{
		if (Sum % 2 == 0)
			return true;
		
		else
		return false;
	}
	
	
	
	public static void displayName(String name, boolean x) // this function displays name 
	{
		if (x)
		{
			String upper = name.toUpperCase();
			System.out.print("The sum of the numbers on the two dices is even!\n");
			
			System.out.print(upper);
			System.out.print(" \n");
			
		}
		else
		{
			System.out.print("The sum of the numbers on the dices is odd!\n");
			String lower = name.toLowerCase();
		
			System.out.print(lower);
			System.out.print(" \n");
		}
		
	} // end function
	
	
} // this bracket ends the class Lab2