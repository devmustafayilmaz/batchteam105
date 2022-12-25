package ders25_inheritance;

public class GCorolla extends FToyota{
    String model="Corolla";
    String uretimYeri="Turkiye";
    GCorolla(){
        System.out.println("corolla constructor ı calisti");
    }

    public static void main(String[] args) {
        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka);//Toyota
        /*
        bir child classta obje oluşturduğumuzda
        oluşturulan obje sadece child class'a ait ozellikleri değil
        tum parent classlarindaki ozellikleri tasir
        bir objenin bir class in özelliklerini taşımasi için 
         */

    }

}
