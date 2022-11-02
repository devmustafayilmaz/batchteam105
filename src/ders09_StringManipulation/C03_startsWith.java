package ders09_StringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "manti acarken Java ogrenilmez";
        System.out.println(str.startsWith("manti"));
        System.out.println(str.startsWith("manti acarken Java ogrenilmez"));
        System.out.println(str.startsWith(""));
        System.out.println( str.startsWith("acarken", 6));
        System.out.println(str.startsWith("java",10));
    }
}
