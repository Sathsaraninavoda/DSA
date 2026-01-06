/*
 * Rabbit Population Problem
 * Based on Fibonacci series
 * Each month:
 *  - Mature rabbit pairs produce a new pair
 */

import java.util.Scanner;

public class RabbitProblem {

    /*
     * rabbits() method
     * Calculates number of rabbit pairs for a given month
     * Uses recursion
     */
    public static int rabbits(int month) {

        // Base cases
        if (month == 0 || month == 1)
            return 1;

        // Recursive case
        return rabbits(month - 1) + rabbits(month - 2);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int month = sc.nextInt();

        System.out.println("Total rabbit pairs after " 
                + month + " months: " + rabbits(month));
    }
}
