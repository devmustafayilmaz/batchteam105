package ders10_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println( str.replace('a', 'A'));
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace("candir","cok guzeldir"));
        System.out.println(str.replace(" ",""));

        // String deki tüm a ları yok edin.
        System.out.println(str.replace("a",""));
        System.out.println(str.replace("Java","hava").replace("candir","cok guzel"));
        System.out.println(str.replaceFirst("a","A"));


        System.out.println(str.replace("","_"));


    }
}
