package ders23_PassByvalue;

public class C01_passByValue {
    public static void main(String[] args) {
        double fiyat=100;

        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));
        System.out.println(fiyat);
        fiyat=indirimUygula(fiyat);
        System.out.println("indirimli atanmış degeri: "+fiyat);



    }
    /*
    kodlarimizin anlasililr olmasi icin main methoddan diger methodlara gonderdigimiz
    parametre olarak gonderdigimiz variabler'lar icin ayni isimli variable olusturmayi TERCİH EDERİZ...,
    java method lar arasında geçiş yaparken variable i değil variable'ın(degeri) value'sunu test eder...
    bu javanın value yu tercih etmesinden kaynaklanıyor. eğer methodun içerisinde yaptığınız değişikliğin main method
    içinde geöerli olmasini isterseniz main method içerisinde
    fiyat =

     */
    public static double indirimUygula(double fiyat){

        fiyat*=0.9;
        return fiyat;
    }


}
