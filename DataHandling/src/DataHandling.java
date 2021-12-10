/*
 * Date: 8/23/2021
 * Author: Lucas Hurst
 * Purpose: To teach handling data via the use of variables  
 */
public class DataHandling {

	public static void main(String[] args) {
		String name = "Big O";
		double payRate = 20.50;
		int hoursWorked = 15;
		final double TAX_RATE = .20;
		double deductions = 100'.00;
		
		double grossPay = payRate * hoursWorked - deductions;
		double taxesPaid = TAX_RATE*grossPay;
		double netPay = grossPay - taxesPaid;
		
		
		System.out.println("Paycheck for "+name);
		System.out.println("Hourly Rate = $"+payRate);
		System.out.println("Hours Worked = "+hoursWorked);
		System.out.println("Deductions $"+deductions);
		System.out.println("Gross Pay = $" + grossPay);
		System.out.println("Taxes Paid = $" +taxesPaid);
		System.out.println("Net Pay = $"+netPay);
		
	}//end of main method

}// end of DataHandling class
