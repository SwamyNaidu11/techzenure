/*author Manikanta Swamy
 date 27-07-2023 */

package com.techzenure.day1and2;
import java.util.Scanner;

public class BillGeneration {
    public static void main(String[] args) {
        // Given prices
        int pizzaPrice = 100;
        int puffPrice = 20;
        int coolDrinkPrice = 10;

        // Input quantities
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pizzas bought: ");
        int pizzas = scanner.nextInt();

        System.out.print("Enter the number of puffs bought: ");
        int puffs = scanner.nextInt();

        System.out.print("Enter the number of cool drinks bought: ");
        int coolDrinks = scanner.nextInt();
        scanner.close();

        // Calculate costs
        int pizzaCost = pizzas * pizzaPrice;
        int puffCost = puffs * puffPrice;
        int coolDrinkCost = coolDrinks * coolDrinkPrice;

        // Calculate total price
        int totalPrice = pizzaCost + puffCost + coolDrinkCost;

        // Display the bill
        System.out.println("\nBill Details");
        System.out.println("No of Pizzas:          " + pizzas + "\tCost: " + pizzaCost);
        System.out.println("No of Puffs:           " + puffs + "\tCost: " + puffCost);
        System.out.println("No of Cool Drinks:     " + coolDrinks + "\tCost: " + coolDrinkCost);
        System.out.printf("\nTotal price=%.2f%n", (double) totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}
