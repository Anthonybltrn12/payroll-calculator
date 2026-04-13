package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        otHours();

    }
    public static void otHours(){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = myScanner.nextLine();

        System.out.print("How many hours did you work this pay-period?");
        int hoursWorked = myScanner.nextInt();

        System.out.print("What is your hourly rate?");
        double hourlyRate = myScanner.nextDouble();

        myScanner.nextLine();

        if (hoursWorked > 40){
            double overtimeHours = hoursWorked - 40;
            double overtimePay = (overtimeHours * (hourlyRate * 1.5)) + (hourlyRate * hoursWorked);
            System.out.println(userName + " makes $" + overtimePay + " per check");
        }
        else {
            System.out.println(userName + " makes $" + (hoursWorked * hourlyRate) + " per check");
        }

    }
}
