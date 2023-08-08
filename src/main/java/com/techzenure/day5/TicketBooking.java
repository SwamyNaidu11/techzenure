/*author manikanta swamy
 date 08-01-2023 */


package com.techzenure.day5;
import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        } else {
            System.out.println("Invalid number of available tickets. Setting to 0.");
            Ticket.availableTickets = 0;
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            return nooftickets * price;
        } else {
            return -1;
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int bookings = sc.nextInt();

        System.out.print("Enter the available tickets: ");
        int initialAvailableTickets = sc.nextInt();
        Ticket.setAvailableTickets(initialAvailableTickets);

        for (int i = 0; i < bookings; i++) {
            System.out.print("Enter the ticketid: ");
            int ticketId = sc.nextInt();

            System.out.print("Enter the price: ");
            int price = sc.nextInt();

            System.out.print("Enter the no of tickets: ");
            int noOfTickets = sc.nextInt();

            Ticket ticket = new Ticket();
            ticket.setTicketid(ticketId);
            ticket.setPrice(price);

            int totalAmount = ticket.calculateTicketCost(noOfTickets);
            if (totalAmount == -1) {
                System.out.println("Tickets not available for booking.");
            } else {
               
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            }
        }

        sc.close();
    }
}
