package ders08_StringManipulation;

public class C06_Substring {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.length());


        String sonHarf = "" +str.charAt(str.length()-1);
        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);

        //son index teki karakteri upperCase olarka yazdirin.
        System.out.println(str.substring(str.length()-1).toUpperCase());
        System.out.println(str.substring(str.length()-3).toUpperCase());


    }
}
