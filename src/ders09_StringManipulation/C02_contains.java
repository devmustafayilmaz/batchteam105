package ders09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama çok zevkli";
        str.contains("cok");

                //CharSequence : char dizisi
        System.out.println(str.contains("çok"));// parametre olarak char kabul etmez
        System.out.println(str.contains("j"));
        String str2 = "Java";
        System.out.println(str.contains(str2));
        String str3="234 Ali can ";
        str3.contains("2");
    }
}
