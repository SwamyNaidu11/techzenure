/*author Manikanta Swamy
 date 28-07-2023 */

package com.techzenure.day3;
import java.util.Scanner;

public class RevreseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int rn = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rn = rn * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rn);
    }
}
