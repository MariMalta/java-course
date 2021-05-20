package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: " );
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number,holder);
        }
        System.out.println();
        System.out.println("Account Data");
        System.out.println(account);

        System.out.println();
        System.out.println("Deposit Value: ");
        double value = sc.nextDouble();
        account.depositValue(value);
        System.out.println(account);

        System.out.println();
        System.out.println("WithDraw Value: ");
        double withDrawValue = sc.nextDouble();
        account.withdraw(withDrawValue);
        System.out.println(account);

        sc.close();
    }
}
