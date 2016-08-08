package com.Agrodz.utils.convertors.menus;

import java.util.Scanner;
import com.Agrodz.utils.convertors.arrays.loops.ArrayThousand;
import com.Agrodz.utils.convertors.arrays.loops.BubbleSort;
import com.Agrodz.utils.convertors.arrays.loops.EvenFifteen;
import com.Agrodz.utils.convertors.arrays.loops.OddNineNine;
import com.Agrodz.utils.convertors.arrays.loops.TwoDimensionNineNine;
import com.Agrodz.utils.convertors.arrays.loops.TwoTwentyArray;


public class ArrayMenu {

public static void arrayMenu() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
                while (true) {
                        while (true) {
                        System.out.println("\n Welcome! Select one of programs is necessary to " +
                                "make next choice and press Enter: \n" +
                                "\n 1 - Even numbers from 2 to 20" +
                                "\n 2 - Odd numbers from 1 to 99 and back" +
                                "\n 3 - Array of random integer numbers from 0 to 9" +
                                "\n 4 - Array of random integer Max/Min numbers from 0 to 999" +
                                "\n 5 - Two-dimensional array of random integer numbers from 1 to 99" +
                                "\n 6 - Bubble sort from smaller to bigger and from bigger to smaller" +
/*                              "\n 7 - Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999\" +
                                "\n 8 - Sort array by 'Selection sort'" +
                                "\n 9 - The two-dimensional array with a maximum output of a random number from -99 to 99 \n" +
                                "\n x - Via keyboard is entered 'Bubble sort from smaller to bigger' array \n" +  */
                                "\n 0 - Exit");
                        int numberOfChoice;
                        if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                                numberOfChoice = scanner.nextInt();

                                switch (numberOfChoice) {

                                case 0:
                                        System.out.println(" " + "Exit");
                                        break labelOfExit;

                                case 1:
                                        System.out.println("Starting program: " + "Even numbers from 2 to 20");
                                        TwoTwentyArray.twoTwentyArray();
                                        break;

                                case 2:
                                        System.out.println("Starting program: " + "Odd numbers from 1 to 99 and back");
                                        OddNineNine.oddNineNine();
                                        break;

                                case 3:
                                        System.out.println("Starting program: " + "Array of 15 random integer numbers from 0 to 9");
                                        EvenFifteen.evenFifteen();
                                        break;

                                case 4:
                                        System.out.println("Starting program: " + "Array of random integer Max/Min numbers from 0 to 999");
                                        ArrayThousand.arrayThousand();
                                        break;

                                case 5:
                                        System.out.println("Starting program: " + "Two-dimensional array of random integer numbers from 1 to 99");
                                        TwoDimensionNineNine.twoDimensionNineNine();
                                        break;

                                case 6:
                                        System.out.println("Starting program: " + "Bubble sort from smaller to bigger and from bigger to smaller");
                                        BubbleSort.bubbleSort();
                                        break;

        //        case 7:
        //        System.out.println("Starting program: " + "Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999");
        //        TwoArrayOfRandomNumberAlignedOnRightFrom1To999.calculateLoopNumbers();
        //        break;

        /*    case 8:
              System.out.println("Starting program: " + "Via keyboard is entered 'Bubble sort from smaller to bigger' array");
              BubbleSortEnteredKeyboardArray.calculateLoopBubbleSort();
              break;*/

        //        case 8:
        //        System.out.println("Starting program: " + "Sort array by 'Selection sort'");
        //        SelectionSortArray.calculateLoopNumbers();
        //        break;
        //        case 9:
        //        System.out.println("Starting program: " + "The two-dimensional array with a maximum output of a random number from -99 to 99");
        //        TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99.calculateLoopNumbers();
        //        break;

                        default:
                                System.out.println("Sorry, this number doesn't select any program. Please try again.");
                                break;           //break labelOfExit;           // для выхода из цикла
                        }
                }
                        else {
                                System.out.println("Sorry, this number doesn't select any program. Please try again.");
                                break;                              // без 'break' программа зацикливается
                        }
                        System.out.println("\n Program has processed your choice.");
                        try {
                                Thread.sleep(7000);              // Задержка при выводе результата на 3 сек
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                        }
                }
        }
}