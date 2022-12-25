package ders46_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_maps {
    public static void main(String[] args) {
        //ogrenci map inde
        // tüm öğrencilerin
        // bolum,sinif, sube,numara, isim, soyIsim ve numaralarini yazdirin.

        //onceki iki derste key(Set) ve value(collection) degerlerini toplu olarak alabiliyorduk.
        //ancak key ve value birlikte kullanmak istediğimizde
        //bu islemi yapmak zor olur.

        // bunun için Java ENtry Class'ini olusturmustur.
        // Entry2ler key=Value ikilisini 1 enrty olarak kabul ederler.
        
        Map<String,String>kullaniciBilgileriMap= new HashMap<>();

            kullaniciBilgileriMap.put("isim","mehmet");
            kullaniciBilgileriMap.put("hesap turu","USD");



            Map<String,String>hesapHareketDetayi=new HashMap<>();
            Map<String,String>hesapHareketleriMap=new HashMap<>();





    }
}
