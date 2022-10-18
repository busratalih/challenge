package day10;

import java.util.Scanner;

public class Q03_NestedForLoop {
    public static void main(String[] args) {

    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
     */


        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=sc.nextInt();
        int adet=0;
        for (int i = 1; i <=sayi ; i+=2) {
            System.out.println(i+ " ");
            adet++;
        }
        System.out.println(adet+ "tane tek sayi vardir");


     //  Scanner scanner = new Scanner(System.in);
     //  System.out.print("sayi giriniz :");
     //  int sayi = scanner.nextInt();
     //  int count = 0;//sayac tek olan sayilari sayan degisken
     //  while(sayi>0){
     //      if(sayi%2==1){
     //          System.out.print(sayi + " ");
     //          count++;
     //      }
     //      sayi--;
     //  }
     //  System.out.println();
     //  System.out.println("count = " + count);























    }
}
