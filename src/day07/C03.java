package day07;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


            Scanner scan = new Scanner(System.in);
            String isim = scan.next();
            String soyIsim = scan.next();
            if(isim.length()>soyIsim.length())
                System.out.println("isminiz daha uzun");
            else if(isim.length()==soyIsim.length())
                System.out.println("isim ve soyisim uzunluklari esit");
            else System.out.println("soyisminiz daha uzun");





















        }
}
