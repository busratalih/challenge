package day05;

import java.util.Scanner;

public class C_04 {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cumle oluşturmak için kelime giriniz :"); String word1=scan.next();
        System.out.println("lutfen cumle oluşturmak için kelime giriniz :"); String word2=scan.next();
        System.out.println("lutfen cumle oluşturmak için kelime giriniz :"); String word3=scan.next();
        System.out.println("lutfen cumle oluşturmak için kelime giriniz :"); String word4=scan.next();

        System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1) + " " + word2 + " " + word3 + " " + word4+ "." );






















    }
}
