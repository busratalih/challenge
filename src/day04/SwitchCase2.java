package day04;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        /*
      * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
      * ornek
      *  Kullanici  : A , B , C harflerinden birini secsin
          A'yi secmis ise, ==> Java is easy
          B'yi secmis ise, ==> Java is fun
          C'yi secmis ise, ==> I need to study :)
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen harflerdenbirini seciniz : \nA \nB \nC");
        char choice=scan.next().toUpperCase().charAt(0);
        switch (choice) {
            case 'A' :
                System.out.println("Jva is easy"); break ;
            case 'B' :
                System.out.println("Jva is fun"); break;
            case 'C' :
                System.out.println("I need to study"); break;
            default:
                System.out.println("invalid");
        }


















    }
}