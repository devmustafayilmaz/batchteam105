package ders05_concatenation_opertorler;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz:");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        if(sayi1>100){
            System.out.println("birinci sayi 100'den büyüktür.");
        }

       if(sayi2%2==0){
        System.out.println("ikinci sayi cifttir.");
    }
       if(sayi1>sayi2)
       {
        System.out.println("ilk sayi ikinci sayidan buyuktur.");
    }
    }
}
