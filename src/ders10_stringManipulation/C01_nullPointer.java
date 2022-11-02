package ders10_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        //str1 e deger atanmıştır. Hiçlik
        System.out.println(str1);
        System.out.println(str1.concat("java"));
        String str2;
        //System.out.println(str2.contains("javar")); //deger atanmadığı icin yazdırılamaz
        String str3=null; // str3 e deger atamadıgımızın farkındayiz
        System.out.println(str3);
        System.out.println( str3.concat("Java"));
    }
}
