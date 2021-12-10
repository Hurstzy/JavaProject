/*
 * Author: Lucas Hurst
 * Date: 10/28/2021
 * Purpose: hghgdgghkkjfhdgh
 */

import java.util.Scanner;
public class Dots {
	
	public static void dots(int qty, double time) {
		
		for (int i = 1; i <= qty; i++) {
			System.out.print(".");
			try
			{
				Thread.sleep((int)(time * 1000));
			} // end of try
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		} // end of for loop
	} // end of dots method

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many dots?");
		int dots = input.nextInt();
		
		System.out.println("How many seconds between each dot?");
		double delay = input.nextDouble();
		
		dots(dots, delay);
		
	} // end of main method

} // end of Dots class
