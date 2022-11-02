package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi girniz :");
        String isim = scan.nextLine();
        System.out.println("lutfen soyisminiz yaziniz :");
        String soyİsim = scan.nextLine();
        System.out.println("lutfen yasinizi giriniz :");
        double yas = scan.nextDouble();
        System.out.println("isminiz : " + isim +"\nsoyisminiz :" + soyİsim+ "\nyasiniz :" + yas + "\nkaydiniz basariyle olusturulkdu");
    }
}
