package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Room[] vect = new Room[10];

        System.out.println("Please add the number of rooms you want to rent: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Rent " + i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Number of the room:");
            int number = sc.nextInt();

            vect[number] = new Room(name, email, number);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
