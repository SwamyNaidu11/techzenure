/*author Manikanta Swamy
 date 28-07-2023 */


package com.techzenure.day3;
import java.util.Scanner;

public class EvenNumbersBetween {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int x = scanner.nextInt();
	        System.out.print("Enter the last number: ");
	        int y = scanner.nextInt();
	        scanner.close();

	        if (y <= x + 1) {
	            System.out.println("ERROR:  there are first number is greaaterthan second number.");
	            return;
	        }

	        System.out.println("Even Numbers between " + x + " and " + y + "  are:");

	        for (int num = x + 1; num < y; num++) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}
