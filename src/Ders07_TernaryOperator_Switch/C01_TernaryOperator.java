package Ders07_TernaryOperator_Switch;

public class C01_TernaryOperator {
    public static void main(String[] args) {
    int a=25;
    // Ternary operatörü tek başına kullanılamaz
        // Ternary bize sonuc üretir bu sonucu ya direk yazdırmalı veya
        //bir variable a atamalıyız..
    String sonuc =a%2==0 ? "cift sayi": "tek sayi";
        System.out.println(a>10 ? "buyuk sayi": 2*a);

    }
}
