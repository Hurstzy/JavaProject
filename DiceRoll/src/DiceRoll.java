import java.util.Scanner;
public class DiceRoll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int diceNum1, diceNum2, diceTotal;
		int amtOfRolls;
		int numsOnSide;
				
		System.out.print("How many dice rolls should I do? "); 
		amtOfRolls = input.nextInt();
		
		System.out.print("How many numbers are on each side of the dice? ");
		numsOnSide = input.nextInt();
		
		System.out.println("Dice #1:   Dice#2:    Total:");
		for (int i = 1; i <= amtOfRolls; i++) {
			diceNum1 = (int)(Math.random()*numsOnSide);
			diceNum2 = (int)(Math.random()*numsOnSide);
			diceTotal = (diceNum1 + diceNum2);

			System.out.format("%-10s %-10s %-10s%n", diceNum1, diceNum2, diceTotal);
		}//end of for loop
		
	} // end of main class

} // end of dice roll class
