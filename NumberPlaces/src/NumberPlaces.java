/*
 * Date: 9/10/2021
 * Author: Mr. Lind
 * Editor: Lucas Hurst
 * Purpose: To take a three digit number and to output its number places
 */
import java.util.Scanner;
public class NumberPlaces {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int number, hundreds, tens, ones;
		
		System.out.print("Number = ");
		number = kb.nextInt();
		hundreds = number/100;
		tens = ((number%100) / 10);
		ones = ((number%100) % 10);
		
		System.out.println("\n\nThe places for " +number+" are: ");
		System.out.println("Hundreds = " +hundreds);
		System.out.println("Tens     = " +tens);
		System.out.println("Ones     = " +ones);
	}//end of main method

}//end of NumberPLaces class
