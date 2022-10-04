package day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {


        System.out.println("-----Arttirma-----");

        int a = 1;

        System.out.println(++a); //2  value :2
        System.out.println(a++); //2  value :3
        System.out.println(a); //3

        System.out.println("-----Azaltma----");

        int b = 5;

        System.out.println(--b); //4  value :4
        System.out.println(b--); //4  value :3
        System.out.println(b); //3

       System.out.println("---soru1---");
       int x = 20;
       int y = 15;

       System.out.println(++x + y--); //36
       System.out.println("x = " + x); //x=21
       System.out.println("y = " + y); // y=14

        int k=5;

        System.out.println(++k + k++ + k++ + --k + k-- + k);
        System.out.println("k = " + k);






























    }
}
