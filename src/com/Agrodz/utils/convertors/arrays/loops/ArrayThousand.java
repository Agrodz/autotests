package com.Agrodz.utils.convertors.arrays.loops;

import java.util.Random;

public class ArrayThousand {

    public static void arrayThousand() {

        //Объявление переменных
        int max = 0;
        int min;

        //Массив на 15 ячеек
        int[] arr = new int[15];
        System.out.println("---------------------------------------------------------------------------------------------------- ");
        System.out.print("  Создан массив из 15 случайных чисел - ");

        //Заполняем ячейки рандом-значениями до 1000
        for (int i = 0; i < 15; i++) {
            arr[i] = new Random().nextInt(1000);
            System.out.print(arr[i] +" ");
        }

        //Макс алгоритм перебора значений
        for (int i = 0; i < 15; i++) {

            //Замена 0, указанного по умолчанию на максимальное значение массива
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //Вывод максимального значения массива
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------- ");
        System.out.print("  При этом максимальное значение составляет " + max);

        //Алгоритм перебора минимального значения массива и его присвоения объявленной переменной
        min = 1000;
        for (int i = 0; i < 15; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //Вывод минимального значения массива
        System.out.print(", а минимальное - " + min + ".");
        System.out.println(" ");
    }
}