package ders29_checkedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        int sayi= 0;
        try {
            sayi = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Adam gibi tam sayi degeri gir beni delirtme!!!");
        }
        int sayiKaresi=sayi*sayi;
        System.out.println("sayinin karesi:"+sayiKaresi);
    }
}
