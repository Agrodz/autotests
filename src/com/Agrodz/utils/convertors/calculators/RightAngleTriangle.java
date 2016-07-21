package com.Agrodz.utils.convertors.calculators;

import java.util.Scanner;

public class RightAngleTriangle {
    public  static void rightAngle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Right angle triangle!" + "\n" + "Please input the first side of triangle:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Input the second side of triangle:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Input the third side of triangle:");
        double thirdNumber = scanner.nextDouble();

        if ((firstNumber * firstNumber + secondNumber * secondNumber == thirdNumber * thirdNumber) ||
                (secondNumber * secondNumber + thirdNumber == firstNumber * firstNumber) ||
                (thirdNumber * thirdNumber + firstNumber * firstNumber == secondNumber * secondNumber)) {
            System.out.println("Congratulations! It is a right-angle triangle");
        }
        else if ((firstNumber + secondNumber < thirdNumber) || (secondNumber + thirdNumber < firstNumber) ||
                (thirdNumber + firstNumber < secondNumber)) {
            System.out.println("Sorry, the triangle doesn't exist.");
        }
        else {
            System.out.println("Sorry, it isn't a right-angle triangle.");
        }
    }
}