package ders29_checkedException;

public class C02_AritmeticException {
    public static void main(String[] args) {
        int sayi2=0;
        int sayi1=20;
        try {
            // riskli gördüğümğz kod bloklarına konulur. adında anlaşıldığı gibi deneme
            System.out.println("sonuc: "+(sayi1/sayi2));
        } catch (ArithmeticException e) {
            System.out.println("sayi sifira bolunemez");
        }
    }
}
