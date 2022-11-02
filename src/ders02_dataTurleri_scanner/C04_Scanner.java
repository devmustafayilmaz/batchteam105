package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen 1. tamsayiyi giriniz:");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. tamsayiyi giriniz :");
        int sayi2= scan.nextInt();
        x= sayi2;
        sayi2 = sayi1;
        sayi1=x;
        System.out.println("1.sayi :" + sayi1 + "\n2.sayi :"+ sayi2);

    }
}
