package com.Agrodz.utils.convertors.arrays.loops;

import java.util.Random;

public class EvenFifteen {
    public static void evenFifteen(){

        //Объявление переменных
        int n=0;

        //Массив на 15 ячеек
        int[] Arr = new int[15];
        System.out.print("Создан массив из 15 случайных чисел - ");
        for(int i=0;i<Arr.length;i++){

            //Заполняем ячейки рандом-значениями до 10
            Random rndm=new Random();
            Arr[i]=rndm.nextInt(10);

            //Вывод массива
            System.out.print(Arr[i] +" ");

            //Определение четности
            if(Arr[i]>0&Arr[i]%2==0)n++;
        }
        System.out.println(",");
        System.out.println("                      из них четных - "+n+".");
    }
}