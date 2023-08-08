/*author Manikanta Swamy
 date 28-07-2023 */


package com.techzenure.day3;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int rem;
        int dispalynum = num; // Store the original number to display in the output

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }

        System.out.println("Sum of digits of " + dispalynum + " = " + sum);
    }
}
