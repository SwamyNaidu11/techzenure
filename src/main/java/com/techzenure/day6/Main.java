/*author manikanta swamy
 date 08-02-2023 */


package com.techzenure.day6;
import java.util.Scanner;

class StudentDetails {
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    public StudentDetails(int studentId, String name, int departmentId, String gender, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }
}

class Hosteller extends StudentDetails {
    private String hostelName;
    private int roomNumber;

    public Hosteller(int studentId, String name, int departmentId, String gender, String phone,
                     String hostelName, int roomNumber) {
        super(studentId, name, departmentId, gender, phone);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of hostellers: ");
        int numHostellers = sc.nextInt();

        Hosteller[] hostellers = new Hosteller[numHostellers];

        for (int i = 0; i < numHostellers; i++) {
            System.out.println("Enter details for Hosteller " + (i + 1) + ":");
            Hosteller hosteller = getHostellerDetails(sc);
            hostellers[i] = hosteller;
        }

        System.out.println("Hosteller Details:");
        for (Hosteller hosteller : hostellers) {
            System.out.println("Student ID: " + hosteller.getStudentId());
            System.out.println("Student Name: " + hosteller.getName());
            System.out.println("Department ID: " + hosteller.getDepartmentId());
            System.out.println("Gender: " + hosteller.getGender());
            System.out.println("Phone Number: " + hosteller.getPhone());
            System.out.println("Hostel Name: " + hosteller.getHostelName());
            System.out.println("Room Number: " + hosteller.getRoomNumber());
            System.out.println();
        }

        sc.close();
    }

    public static Hosteller getHostellerDetails(Scanner sc) {
        System.out.print("Student ID: ");
        int studentId = sc.nextInt();

        sc.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Department ID: ");
        int departmentId = sc.nextInt();

        sc.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Gender [M/F]: ");
        String gender = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Hostel Name: ");
        String hostelName = sc.nextLine();

        System.out.print("Room Number: ");
        int roomNumber = sc.nextInt();

        return new Hosteller(studentId, name, departmentId, gender, phone, hostelName, roomNumber);
    }
}
