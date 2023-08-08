/*author Manikanta Swamy
 date 28-07-2023 */

package com.techzenure.day3;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many odd numbers to be generated: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Exp O/P: ");
        int count = 0;
        int num = 1;

        while (count < n) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
