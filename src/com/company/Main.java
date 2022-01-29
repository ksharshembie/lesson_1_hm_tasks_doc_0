package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Task-1:
        Create 3 variables to store your age, height,and weight and print them using println.
        myAge, myHeight and myWeight
         */
        int myAge;
        float myHeight, myWeight;
        /*
        TASK-2 part1:
        Using java calculate the person's body mass index and print the result with differentexamples.
         */
        System.out.print("\n \"Body Mass Index\" is a simple calculationusing a person's height and weight.\n Theformula is BMI = kg/m2 where kg is a person'sweight in kilograms and m2 is their height in metres squared. \n Please enter you Age: \t");
        Scanner console = new Scanner(System.in);
        myAge = console.nextInt();
        System.out.print("Please enter you Height in sm: \t");
        myHeight = console.nextFloat();
        System.out.print("Please enter you Weight in kilogram: \t");
        myWeight = console.nextFloat();
        double BMI = myWeight / Math.pow((myHeight / 100), 2);
        System.out.println("Your Age is " + myAge + " and Body Mass Index is " + (float) BMI);
        /*
        TASK-3:
        Write the java program that converts givenkilogram values to pounds and grams.NOTE: for an approximate result of kg to pount,multiply the mass value by 2.205
         */
        double pounds = myWeight * 2.205;
        System.out.println("Your Weight in pounds is: " + (float) pounds);
        double grams = myWeight * 1000;
        System.out.println("Your Weight in grams is: " + (float) grams);
        /*
        TASK-4:
        Write the java program that converts given meter values to the foot and centimeter.
        NOTE: for an approximate result of Meter tofoot, multiply the length value by 3.281
         */
        System.out.println("\n There is a Converter is running");
        double meter;
        System.out.print("Please add any Value in meter: \t");
        meter = console.nextDouble();
        double foot = meter * 3.281;
        System.out.println("It is equal to " + foot + " in foots");
        double centimeter = meter * 100;
        System.out.println("It is equal to " + (int) centimeter + " in centimeters");
        /*
        TASK-5:
        Write a Java program that reads a number in inches, converts it to meters.
        Note: One inch is 0.0254 meters.
         */
        float inches;
        System.out.print("\n Please any value in inches: \t");
        inches = console.nextFloat();
        meter = inches * 0.0254;
        System.out.println("It is equal to " + meter + " in meter");
        /*
        TASK-6:
        Write a Java program to convert temperaturefrom Fahrenheit to Celsius degree.
        212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        float fahrenheit;
        System.out.print("\n Input a degree in Fahrenheit: \t");
        fahrenheit = console.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("It is equal to " + celsius + " in Celsuis. \n");

    }
}
