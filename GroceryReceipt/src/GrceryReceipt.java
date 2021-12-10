/*
 * Date: 8/25/2021
 * Name: Lucas Hurst
 * Purpose: create a grocery receipt using vars 
 */

import java.text.DecimalFormat;

public class GrceryReceipt {
				
		public static void main(String[] args) {
	
		double fruitCost = 1.99;
		double veggieCost = 2.85;
		double meatCost = 10.40;
		
		int fruitQty = 1;
		int veggieQty = 3;
		int meatQty = 2;
		
		double taxRate = 0.06;
		
		double subTotal = ((fruitQty * fruitCost) + (veggieQty * veggieCost) + (meatQty * meatCost));
		double taxTotal = (subTotal * taxRate);
		double total = (subTotal + taxTotal);
		
		DecimalFormat df = new DecimalFormat("##########.##");

		System.out.println("Receipt - 8/25/2021 \n");
		System.out.println(fruitQty + " fruit " + "@ $" + fruitCost);
		System.out.println(veggieQty + " veggie " + "@ $" + veggieCost);
		System.out.println(meatQty  + " meat " + "@ $" + meatCost);
		System.out.println();
		System.out.println("Subtotal: $" + df.format(subTotal));
		System.out.println("Tax: $" + df.format(taxTotal));
		System.out.println("Total: $" + df.format(total));
	}//end main class
}//end GroceryReceipt