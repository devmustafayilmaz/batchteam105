package ders02_dataTurleri_scanner;
import java.util.Scanner;
public class C01_DataTurleri {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ondalıklı bir sayi giriniz :");
        double ondalikliSayi = scan.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz :");
        int tamSayi = scan.nextInt();
        System.out.println(ondalikliSayi + tamSayi);

    }
}
