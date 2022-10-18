package day10;

import java.util.Scanner;

public class Q01_WhleDoWhile {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        //  Scanner scan = new Scanner(System.in);
        //  System.out.println("lütfen bir sayi giriniz: ");
        //  int sayi = scan.nextInt();
        //  int rakamtoplam = 0;
        //  while(sayi>0){
        //      rakamtoplam+=sayi%10;
        //      sayi/=10;
        //  }
        //  System.out.println("rakamtoplam = " + rakamtoplam);


        int sayi = 2562;
        System.out.println(basamakToplami(sayi));


    }// main sonu

    private static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;


    }

}
