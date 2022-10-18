package day09;

import java.util.Scanner;

public class Q05_Nested_ForLoop {

    public static void main(String[] args) {


        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("satir sayisi :");  int satir= scanner.nextInt();
        System.out.println("sutun sayisi :");  int sutun=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }

            System.out.println(); // dumy, bu bosluk olmazsa hepsini yan yana yazar
        }























    }



}
