package day05;

public class C_07 {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        String s="abcdxyzi";
        boolean xyzIceriyorMu=false;
        if (s.contains("xyz")) {
            xyzIceriyorMu=true;
        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }




















    }
}
