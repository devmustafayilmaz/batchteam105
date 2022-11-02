package ders11_ForLoops;

public class C02_Rakamlar_toplami {
    public static void main(String[] args) {
        //kullanicinin verdigi sayinin rakamlar toplami..
        int sayi=1111009;
        String sayiStr=" "+sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;



        for (int i = 1; i <=sayiStr.length(); i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;


        }
        System.out.println(rakamlarToplami);
    }
}
