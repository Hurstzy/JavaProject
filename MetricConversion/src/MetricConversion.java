/*
 * Date: 10/21/2021
 * Author: Lucas Hurst
 * Purpose: Metric conversion
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##########.##");
		
		boolean using = true;
		
		while (using) {

			System.out.print("Enter a number: ");
			double number = input.nextDouble();

			System.out.println();
			System.out.println("Convert:");
			System.out.format("%-30s %-10s %n", "1. Inches to Centimeters" ,"5. Centimeters to Inches");
			System.out.format("%-30s %-10s%n", "2. Feet to Centimeters" ,"6. Centimeters to Feet");
			System.out.format("%-30s %-10s%n", "3. Yards to Meters" , "7. Meters to Yards");
			System.out.format("%-30s %-10s%n", "4. Miles to Kilometers" , "8. Kilometers to Miles");

			System.out.println();
			System.out.println("9. Exit");

			System.out.println();
			System.out.print("Enter your method: ");

			int method = input.nextInt();
			double conversion;
			
			switch (method) {
			case 1:
				conversion = (number * 2.54);
				System.out.println(number + "inches is " + df.format(conversion) + " centimeters.");
				break;
			case 2:
				conversion = (number * 30);
				System.out.println(number + " feet is " + df.format(conversion) + " centimeters.");
				break;
			case 3:
				conversion = (number * 0.98);
				System.out.println(number + " yards is " + df.format(conversion) + " meters.");
				break;
			case 4:
				conversion = (number * 1.6);
				System.out.println(number + " miles is " + df.format(conversion) + " kilometers.");
				break;
			case 5:
				conversion = (number / 2.54);
				System.out.println(number + " centimeters is " + df.format(conversion) + " inches.");
				break;
			case 6:
				conversion = (number / 30);
				System.out.println(number + " centimeters is " + df.format(conversion) + " feet.");
				break;
			case 7:
				conversion = (number / 0.98);
				System.out.println(number + " meters is " + df.format(conversion) + " yards.");
				break;
			case 8:
				conversion = (number / 1.6);
				System.out.println(number + " kilometers is " + df.format(conversion) + " miles.");
				break;
			case 9:
				using = false;
				break;
			default:
				System.out.println("Please enter a number 1-8 as a conversion method or 9 to exit.");
				break;	
			}// end of switch for method
		}// end of while loop for using
	} // end main class
} // end MetricConversion class
