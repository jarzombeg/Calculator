package com.company;
import java.util.Scanner;

public class Main {

    public static double salaryCalculator ( double hoursPerWeek, double hourlyRate){
        double weeklyPayCheck = hoursPerWeek * hourlyRate;
         return weeklyPayCheck *52;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println("Hours per week?");
        Scanner hoursPerWeekScanner = new Scanner(System.in);
        double hoursPerWeek = hoursPerWeekScanner.nextInt();
        System.out.println("Hourly Rate?");
        Scanner hourlyRateScanner = new Scanner(System.in);
        double hourlyRate = hoursPerWeekScanner.nextInt();

        double annualSalary = salaryCalculator(hoursPerWeek,hourlyRate);
        System.out.println(annualSalary);

    }

}
