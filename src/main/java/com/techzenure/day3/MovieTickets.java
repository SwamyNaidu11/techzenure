/*author Manikanta Swamy
 date 28-07-2023 */
package com.techzenure.day3;
import java.util.Scanner;

public class MovieTickets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets < 4 || tickets > 40) {
            System.out.print("Number of tickets should be between 4 and 40.");
            sc.close();
            return;
        }

        System.out.print("Refreshments (yes or no): ");
        String refreshment = sc.next().toLowerCase();

        int refreshmentPrice;
        if (refreshment.equals("yes")) {
            refreshmentPrice = 50;
        } else if (refreshment.equals("no")) {
            refreshmentPrice = 0;
        } else {
            System.out.print("Please select yes or no.");
            sc.close();
            return;
        }

        System.out.print("Do you have a coupon code (yes or no): ");
        String couponCode = sc.next().toLowerCase();

        int ticketCost = 0;

        if (couponCode.equals("yes")) {
            System.out.print("Enter the circle (k or q): ");
            String ticketType = sc.next().toLowerCase();

            int ticketPrice;
            if (ticketType.equals("k")) {
                ticketPrice = 75;
            } else if (ticketType.equals("q")) {
                ticketPrice = 150;
            } else {
                System.out.println("Invalid ticket type! Please enter k or q.");
                sc.close();
                return;
            }

            ticketCost = ticketPrice * tickets;
            double discount = ticketCost * 0.12;
            ticketCost -= discount;
        } else {
            System.out.print("Enter the circle (k or q): ");
            String ticketType = sc.next().toLowerCase();

            int ticketPrice;
            if (ticketType.equals("k")) {
                ticketPrice = 75;
            } else if (ticketType.equals("q")) {
                ticketPrice = 150;
            } else {
                System.out.println("Invalid ticket type! Please enter k or q.");
                sc.close();
                return;
            }

            ticketCost = ticketPrice * tickets;
        }

        int refreshmentsPrice = refreshmentPrice * tickets;
        float totalCost = (float) (ticketCost + refreshmentsPrice);
        System.out.printf("Total Ticket Cost: $%.2f%n", totalCost);
        sc.close();
    }
}
