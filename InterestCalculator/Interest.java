package InterestCalculator;

import java.util.Scanner;

public class Interest {
    /* 
     * Ask the user for an initial balance and an annual interest rate, 
     * and print to the console the balance after 1 year.
     * @param args
     */

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Ask the user for initial balance and annual interest rate.
        System.out.println("Input balance: ");
        String balanceInput = sc.nextLine();
        // Convert the received string into a double.
        double balance = Double.parseDouble(balanceInput);
        System.out.println("Input interest rate: ");
        String interestInput = sc.nextLine();
        double interest = Double.parseDouble(interestInput);
        // Perform the interest calculation.
        double result = calculateBalanceAfterYear(balance, interest);
        // Send that data back to the console.
        System.out.println(result);
        sc.close();
    }

    /*
     * add the amount received from interest to the original amount
     * @param principle the starting balance
     * @param apy the interest rate
     * @return the final balance after interest
     */
    public static double calculateBalanceAfterYear(double principle, double apy){
        return principle + calculateProfit(principle, apy);
    }

    /*
     * @param principle
     * @param apy
     * @return the profit gained from principle * apy
     */
    public static double calculateProfit(double principle, double apy){
        return principle * apy;
    }

    /*
     * Whole numbers:
     * byte
     * short
     * int (!)
     * long (sometimes)
     * 
     * Decimal numbers:
     * float
     * double (!)
     * 
     * Characters:
     * char (sometimes)
     * true/false
     * String (!)
     */
}
    
