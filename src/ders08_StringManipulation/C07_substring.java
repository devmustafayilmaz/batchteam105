package ders08_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5,8));
        // 5. indexten baslar (8-5) karakter yazdirir.
        System.out.println(str.substring(9,17));
        System.out.println(str.substring(3,7));
        String isim = "huseYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar
        //kucuk harf olarak kaydedin..
        isim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println(isim.substring(2,5));

        // sadece 3. harfi yazidrin.
        System.out.println(isim.substring(3,4));

        System.out.println(isim.substring(2,2));
        System.out.println(isim.substring(isim.length()-1));




    }
}
