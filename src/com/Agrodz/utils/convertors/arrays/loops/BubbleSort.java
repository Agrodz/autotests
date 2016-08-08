package com.Agrodz.utils.convertors.arrays.loops;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort() {
        Scanner scanner = new Scanner(System.in);
        int j;
        boolean swapFlag = true;
        int tempInt;
        int[] arraysNumber = {62, 84, 32, 5, 7, 14, 17, 55, 2, 13};
        System.out.print("\n" + "The original array is: " + Arrays.toString(arraysNumber).replace("[", "").replace("]","") + "\n ");
        System.out.println("Sorted values from smallest to bigger: ");
        for (int i = 0; i < arraysNumber.length; i++) {
            while (swapFlag) {
                swapFlag = false;
                for (j = 0; j < arraysNumber.length - 1; j++) {
                    if (arraysNumber[j] > arraysNumber[j + 1]) {
                        tempInt = arraysNumber[j + 1];
                        arraysNumber[j + 1] = arraysNumber[j];
                        arraysNumber[j] = tempInt;
                        swapFlag = true;
                    }
                }
            }
            //  System.out.print("Sorted from smallest to bigger:");
            System.out.print(arraysNumber[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" Sorted values from bigger to smallest: ");
        for (int i = arraysNumber.length - 1; i >= 0; i--) {
            // System.out.print("Sorted from bigger to smaller:");
            System.out.print(arraysNumber[i] + " ");
        }
        System.out.println(" ");
    }
}
