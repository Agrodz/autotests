package com.Agrodz.utils.convertors.arrays.loops;

public class TwoDimensionNineNine {

    public static void twoDimensionNineNine(){

        int[][] arr = new int[8][5];

        //Заполнение при помощи двух вложенных циклов:
        // - первым (внешним циклом заполним значения строк "i"
        for(int i=0;i<arr.length;i++){
            // - вторым (внутренним) значения столбцов "j"
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*90)+10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}