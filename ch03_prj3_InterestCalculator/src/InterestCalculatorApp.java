import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to the Interest Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
		// Prompt User Input
			System.out.print("Enter loan amount:   ");
			BigDecimal amt = sc.nextBigDecimal();
			
			System.out.print("Enter interest rate:   ");
			BigDecimal rate = sc.nextBigDecimal();
			
		// Business Logic
			BigDecimal interestAmt = amt.multiply(rate);
					
			interestAmt = interestAmt.setScale(2, RoundingMode.HALF_UP);		
		
		// Currency 2 decimal places and Percentages 3 decimal places
			
			NumberFormat cInstance = NumberFormat.getCurrencyInstance();
			NumberFormat pInstance =NumberFormat.getPercentInstance();
			pInstance.setMinimumFractionDigits(3);
		
		// Display Results
			System.out.println("Loan amount: "+cInstance.format(amt));
			System.out.println("Interest rate: "+pInstance.format(rate));
			System.out.println("Interest amount: "+cInstance.format(interestAmt));
	
		System.out.print("Continue?");
		choice = sc.next();
		}
		
		sc.close();
		System.out.println("bye");
	}

}
