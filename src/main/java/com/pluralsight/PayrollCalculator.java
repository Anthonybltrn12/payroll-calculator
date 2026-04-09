package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = myScanner.nextLine();



        System.out.print("How many hours did you work this pay-period?");
        int hoursWorked = myScanner.nextInt();

        System.out.print("What is your hourly rate?");
        double hourlyRate = myScanner.nextDouble();

        myScanner.nextLine();

        System.out.println(userName + " makes $" + (hoursWorked * hourlyRate) + " per check");


    }
}
