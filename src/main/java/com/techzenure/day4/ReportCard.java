/*author Manikanta Swamy
 date 31-07-2023 */


package com.techzenure.day4;
import java.util.Scanner;

public class ReportCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        System.out.println("REPORT CARD");
        System.out.println("NAME: " + studentName);
        System.out.println("------------------------------");
        System.out.println("SUBJECT\t\tMARK");
        System.out.println("------------------------------");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject-" + i + ":       ");
            int mark = sc.nextInt();
            totalMarks += mark;
        }

        System.out.println("------------------------------");
        System.out.println("TOTAL\t\t" + totalMarks);
        System.out.printf("AVERAGE\t\t%.2f%n", (double) totalMarks / numSubjects);
        System.out.println("------------------------------");

        sc.close();
    }
}
