package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdörtgenin iki kenar uzunlugunu girin " +
        " \n iki kenar uzunulugu arasinda enter'a basin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        System.out.println("Dikdörtgenin alani : "+ (kenar1*kenar2));



    }
}
