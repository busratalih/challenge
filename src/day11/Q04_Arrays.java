package day11;

public class Q04_Arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;
        toplamDokuz(arr, istenenToplam);


    }//main sonu

    private static void toplamDokuz(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) { //outer loop - 1.toplanan
            for (int j = i + 1; j < arr.length; j++) { //inner loop -2.toplanan
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ve " + arr[j] + " toplami :" + istenenToplam);
                }
            }


        }
    }
}
