package ders14_Method;

import java.util.Scanner;

public class C01_Method {
    public static void main(String[] args) {
        /*
        kullanicidan iki sayi alıp bunarın toplmaını yazdıran
        bir method olusturun
         */

        toplama();
        toplama();
        }
        public static void toplama(){

        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi girnizi:");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("girilen sayilarin toplami:"+(sayi1+sayi2));
    }
}
