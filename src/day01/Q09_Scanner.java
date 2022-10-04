package day01;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {

        //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
        //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
         //  Isim – soyisim : Elly Dainty
        //  Kullanicidan ismini alip isminin bas harfini yazdirin.


        Scanner scan= new Scanner(System.in);
     //  System.out.println("cemberin yari capini giriniz : ");
     //  double yaricap= scan.nextDouble();
     //  System.out.println("yarıcap = " + yaricap);
     //  System.out.println("cemberin cevresi : " + 2*3.14*yaricap"");
     //  System.out.println("dairenin alanı :" +3.14*yaricap);


      // System.out.println("lutfen isminizi giriniz : ");
      // String isim = scan.nextLine();
      // System.out.println("lutfen soyisminizi giriniz :");
      // String soyIsim = scan.nextLine();

       // System.out.println("isim -soyisim  :" + isim + " " +soyIsim );

        System.out.println("lutfen isminizi giriniz :");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf);

















    }
}
