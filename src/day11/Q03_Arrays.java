package day11;

import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        //1.adım

        String str="HeySiri";

        //2.adım : heysiriyi byesiriye donustur

        str=str.replaceAll("Hey", "Bye");
        System.out.println("str = " + str);

        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));


        //2.çözüm

        String str1="HeySiri";
        String yeniStr[]= str1.split("y");
        yeniStr[0]="Bye";
        str1=yeniStr[0]+ yeniStr[1];
        System.out.println("str1 = " + str1);


        String arr2[]=new String[1];
        arr2[0]=str1;
        System.out.println(Arrays.toString(arr2));













    }
}
