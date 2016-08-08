//package com.Agrodz.utils.convertors.menus;
//
//import com.Agrodz.utils.convertors.calculators.BiggerSmallerNumber;
//import com.Agrodz.utils.convertors.calculators.CircleArea;
//import com.Agrodz.utils.convertors.calculators.EvenOrOdd;
//import com.Agrodz.utils.convertors.calculators.RightAngleTriangle;
//
//import java.util.Scanner;
//
//public class SplittersMenu {
//    public static void calcZMenu(){
//        System.out.println("Calc Z greet you!");
//        Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose the number of task" + "\n"
//                    + "1 - Area of the circle" + "\n" + "2 - Even or odd number" +
//                    "\n" + "3 - Right angle triangle"+
//                    "\n" + "4 - Bigger and smaller number");
//        double numberOfTask = scanner.nextDouble();
//        if (numberOfTask == 1) {
//            CircleArea.circleArea();
//        } else if (numberOfTask == 2) {
//            EvenOrOdd.evenOrOdd();
//        } else if (numberOfTask == 3) {
//            RightAngleTriangle.rightAngle();
//        } else if (numberOfTask == 4) {
//            BiggerSmallerNumber.biggerSmaller();
//        } else {
//            System.out.println("You had to choose right number of task.");
//            System.out.println("If you want to try again, please restart the program.");
//        }
//    }
//}