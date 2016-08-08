package com.Agrodz.utils.convertors.arrays.loops;

public class TwoTwentyArray {

    public static void twoTwentyArray(){

        //В а храниться значение размера массива
        int a=0;
        for(int i=2;i<=20;i++){
            if(i%2==0)a++;
        }
        //массив заполняется через цикл if for
        int[] Mas = new int[a];
        for(int i=2,b=0;i<=20;i++){
            if(i%2==0){
                Mas[b]=i;
                System.out.print(Mas[b]+" "); // вывод на экран значений массива в строку
                b++;
            }
        }
        //вывод на экран значений массива в столбик
        System.out.println(" ");
        for(int i=0;i<Mas.length;i++){
            System.out.println(Mas[i]);
        }
    }
}