package com.Agrodz.utils.convertors.menus;

import com.Agrodz.utils.convertors.calculators.CircleArea;
import com.Agrodz.utils.convertors.calculators.EvenOrOdd;
import com.Agrodz.utils.convertors.calculators.RightAngleTriangle;

import  java.util.Scanner;

public class CalcZMenu {
    public static void run(){

        System.out.println("Calc Z greet you!");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Calc Z greet you! Choose the number of task" + "\n"
                    + "1 - Area of the circle" + "\n" + "2 - Even or odd number" +
                    "\n" + "3 - Right angle triangle");

        double numberOfTask = scanner.nextDouble();

        if (numberOfTask == 1) {
            CircleArea.circleArea();
        } else if (numberOfTask == 2) {
            EvenOrOdd.main();
        } else if (numberOfTask == 3) {
            RightAngleTriangle.rightAngle();
        } else {
            System.out.println("You had to choose right number of task.");
            System.out.println("If you want to try again, please restart the program.");
        }
    }
}
