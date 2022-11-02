package ders15_MethodOverloading;

import java.util.Scanner;

public class C01_methodOverloading {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println();


        double girilenSayi=0;
        double toplam=0;
        int sayac=0;
        while(toplam<500){
            System.out.println("toplamak için sayi giriniz :");
            girilenSayi=scan.nextDouble();
            toplam+=girilenSayi;
           sayac++;
        }
        System.out.println("girilen " + sayac + " sayinin toplami :"+toplam);
    }
}
