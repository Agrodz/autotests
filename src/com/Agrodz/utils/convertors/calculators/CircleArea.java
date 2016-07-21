package com.Agrodz.utils.convertors.calculators;

import java.util.Scanner;

public class CircleArea {
    public static final double PI=3.14d;

    public static void circleArea() {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Welcome to the Circle Area!" + "\n" + "Please input radius: ");
        double radius = scanner.nextDouble();
        double circleArea = PI*radius*radius;
        System.out.println("Area is: " + circleArea);
    }
}