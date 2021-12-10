/*
 * Author: Lucas Hurst
 * Date: 10/26/2021
 * Purpose: Summation of a number
 */
import java.util.Scanner;
public class Summation {
	
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int total = 0;
		for (int i=1; i<=number; i++) {
			total = total + i;
		}
		
		System.out.println("The sum of numbers from 1-" + number + " is " + total + ".");
		
		
	} // end of main method
} // end of Summation