package day09;

import java.util.Scanner;

public class Q06_MethodCreation_ForLoops {

    public static void main(String[] args) {

       /* Interview Question
         Write a Java program to reverse a string. Use for loop and create a method called
        reverseString */


        Scanner scanner=new Scanner(System.in);
        System.out.println("string giriniz");
        String str=scanner.nextLine();
        System.out.println(reverseString(str));


    }

    private static String reverseString(String str) {
        String tersiStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersiStr+=str.charAt(i);
        }
        return tersiStr;
    }











}
