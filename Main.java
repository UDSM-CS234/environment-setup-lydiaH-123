package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Earth's gravity in m/s^2
        double v = 0.0;
        double t = 10.0;
        double p = 0.0;

        System.out.println("The object's position after " + t +
                " seconds is " + 0.5* a*t*t+v*t+p + " m.");
    }
}
