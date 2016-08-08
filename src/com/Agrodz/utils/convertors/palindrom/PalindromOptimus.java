package com.Agrodz.utils.convertors.palindrom;

import java.util.Scanner;

public class PalindromOptimus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the phrase for palindrom checking:");
        String phrase = scan.nextLine();
        System.out.println(phrase.toLowerCase());

        char[] pharrayone = phrase.toCharArray();
        System.out.println(istPalindrom(pharrayone));
    }
    public static boolean istPalindrom(char[] phrase){
        boolean palindrom = false;
        if(phrase.length%2 == 0){  //проверка на палиндром
            for(int i = 0; i < phrase.length/2; i++){
                if(phrase[i] != phrase[phrase.length-i-1]){ // если нечет - забирает 1 букву и потом делит
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (phrase.length-1)/2; i++){
                if(phrase[i] != phrase[phrase.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}