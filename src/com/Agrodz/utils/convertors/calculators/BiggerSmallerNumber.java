package com.Agrodz.utils.convertors.calculators;

import java.util.Scanner;

public class BiggerSmallerNumber{
    public static void biggerSmaller(){
        Scanner biggerSmaller = new Scanner(System.in);
        System.out.println("The biggest integer detector greets you!");
        System.out.println("Enter first integer: ");
        int a = biggerSmaller.nextInt();
        System.out.println("Enter second integer: ");
        int b = biggerSmaller.nextInt();
        if (a > b) {
            System.out.println("The first entered integer " + a + " bigger than " + b); }
        else {
            System.out.println("The second entered integer " + b + " bigger than " + a);
        }
    }
}