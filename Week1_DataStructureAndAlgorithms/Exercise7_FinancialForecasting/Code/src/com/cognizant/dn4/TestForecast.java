package com.cognizant.dn4;
import java.util.Scanner;

public class TestForecast {
    public static void main(String[] args) {
        double currentValue;
        double annualGrowthRate;
        int years;
        int currYear;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting year (eg: 2025): ");
        currYear = sc.nextInt();
        System.out.print("Enter value at starting year (in rupee): ");
        currentValue = sc.nextDouble();
        System.out.print("Enter annual growth rate (in decimal, e.g. 0.12 for 12%): ");
        annualGrowthRate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        years = sc.nextInt();
        sc.close();
        
        double futureValue = Forecast.forecastRecursive(currentValue, annualGrowthRate, years, currYear);
        System.out.printf("Future value after %d years: Rs. %.2f\n", years, futureValue);
    }
}