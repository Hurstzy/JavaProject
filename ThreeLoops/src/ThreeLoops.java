/*
 * Date: 10/25/2021
 * Author: Lucas Hurst
 * Purpose: to learn three variatons of oppng structures
 */

import java.util.Scanner;
public class ThreeLoops {

	public static void main(String[] args) {
		
		boolean userContinues = true;
		int i = 1;
		while (i<=5) {
			i++;
			
			System.out.println(i);
		} // end of while loop
		
		for (int j = 1; j<=5; j++) {
			System.out.println(j);
		} // end of for loop
		
		int k = 1;
		do {
			System.out.println("K = " + k);
			k++;
		} while (k <= 5);
		
	} // end of main method
} // end of ThreeLoops class