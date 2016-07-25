package com.Agrodz.utils.convertors.calculators;

import java.util.Scanner;

public class BiggerSmallerNumber{
    public static void biggerSmaller(int a, int b ){
        Scanner biggerSmaller = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = biggerSmaller.nextInt();
        System.out.println("Enter Second Number: ");
        b = biggerSmaller.nextInt();
        biggerSmaller(a, b); if (a > b) {
            System.out.println(a + " is bigger"); }
        else {
            System.out.println(b + " is bigger");
        }
    }
}