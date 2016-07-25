package com.Agrodz.utils.convertors.calculators;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd(){
        int evenOrOdd;
        System.out.println("Enter an integer for odd or even checking: ");
        Scanner in = new Scanner(System.in);
        evenOrOdd = in.nextInt();

        if (evenOrOdd % 2 == 0)
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}