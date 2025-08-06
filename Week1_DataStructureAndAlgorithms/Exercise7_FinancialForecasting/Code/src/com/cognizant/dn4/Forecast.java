package com.cognizant.dn4;

public class Forecast {
    public static double forecastRecursive(double currentValue, double rate, int years, int currYear) {
        if (years == 0) {
            return currentValue; // Base case
        }
        double forecastedVal = forecastRecursive(currentValue, rate, years - 1, currYear) * (1 + rate);
        int forecastYear = currYear + years;
        System.out.println("Forecasted value for the FY" + forecastYear + " : Rs." + forecastedVal);
        return forecastedVal; // amount after compound interest
    }
}

