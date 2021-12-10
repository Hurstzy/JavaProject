/*
 * Date: 08/31/2021
 * Name: Lucas Hurst
 * Purpose: Reciept that calculates information with inputs
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.format.DateTimeFormatter; // taken from https://www.javatpoint.com/java-get-current-date
import java.time.LocalDateTime; // taken from https://www.javatpoint.com/java-get-current-date
public class GroceryReceiptV3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##########.##");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // taken from https://www.javatpoint.com/java-get-current-date
		LocalDateTime now = LocalDateTime.now(); // taken from https://www.javatpoint.com/java-get-current-date

		double fruitCost = 1.99;
		double veggieCost = 2.85;
		double meatCost = 10.40;
		
		int fruitQty;
		int veggieQty;
		int meatQty;
		
		System.out.print("How much fruit did you purchase? ");
		fruitQty = keyboard.nextInt();
		System.out.print("How much veggies did you purchase? ");
		veggieQty = keyboard.nextInt();
		System.out.print("How much meat did you purchase? ");
		meatQty = keyboard.nextInt();
							
		double taxRate = 0.06;
		
		double paidAmt;
		
		double subTotal = ((fruitQty * fruitCost) + (veggieQty * veggieCost) + (meatQty * meatCost));
		double taxTotal = (subTotal * taxRate);
		double total = (subTotal + taxTotal);
		double change;
		
		System.out.println("\n");

		System.out.println("Receipt - " +dtf.format(now)+ "\n"); // dtf.format(now) taken from https://www.javatpoint.com/java-get-current-date
		System.out.println(fruitQty + " fruit " + "@ $" + fruitCost);
		System.out.println(veggieQty + " veggie " + "@ $" + veggieCost);
		System.out.println(meatQty  + " meat " + "@ $" + meatCost);
		System.out.println();
		System.out.println("Subtotal: $" + df.format(subTotal));
		System.out.println("Tax: $" + df.format(taxTotal));
		System.out.println("Total: $" + df.format(total));
		
		System.out.println("\n");
		
		System.out.print("How much are you paying? ");
		paidAmt = keyboard.nextDouble();
		change = Double.parseDouble(df.format((paidAmt - total)));
		
		System.out.println("\n");
		
		System.out.println("Change Due: $" +df.format(change));

		int changeInt = (int)(Math.round(change * 100));
		int dollar = (changeInt/100);
		changeInt = changeInt % 100;
        int quarter = (changeInt/25);
        changeInt = changeInt % 25;
        int dime = (changeInt/10);
        changeInt = changeInt % 10;
        int nickel = (changeInt/5);
        changeInt = changeInt % 5;

        System.out.println("Dollars Due: "+dollar);
		System.out.println("Quarters Due: "+quarter);
		System.out.println("Dimes Due: "+dime);
		System.out.println("Nickels Due: "+nickel);
		System.out.println("Pennies Due: "+changeInt);
		
		
	}// end of main method

}//end of GroceryReceiptV2
