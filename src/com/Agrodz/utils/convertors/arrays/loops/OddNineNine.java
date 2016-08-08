package com.Agrodz.utils.convertors.arrays.loops;

public class OddNineNine {
    public static void oddNineNine(){
        //n - значение размера массива, получаемое с помощью простого цикла
        int n=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)n++;
        }
        //Arr - массив, c заполнением циклом.
        int[] Arr = new int[n];
        for(int i=1,k=0;i<=99;i++){
            if(i%2!=0){
                Arr[k]=i;
                System.out.print(Arr[k]+" "); //  Вывод на экран в строку
                k++;
            }
        }
        //Вывод элемента массива в обратном порядке
        System.out.println(" ");
        for(int i=Arr.length-1;i>=0;i--){
            System.out.print (Arr[i]+" ");
        }
    }
}