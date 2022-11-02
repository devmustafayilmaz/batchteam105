package ders10_stringManipulation;

public class C03_replaceALL{
    public static void main(String[] args) {

        String str ="J1ava2 G9uzel5dir8";
        // str daki sorıları silip metni java guzeldir haline donusturelim
        System.out.println(str.replaceAll("\\d",""));
        //replaceALL sadece bir harf değil genelleme ile soyleyebilcegimiz ortak özellikteki tüm karakterleri değiştirir
        System.out.println(str.replaceAll("\\D",""));
        String s1= "ilk urun fiyati : 1250";
        String s2 = "ikinci urun fiyati :1500 tl";
        s1=s1.replaceAll("\\D","");
        s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);//yanyana yazar
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));


    }
}
