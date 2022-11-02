package ders09_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
         String str = "Ahmet hoca ile hersey clear";
        System.out.println( str.indexOf("a"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("e",9));
        System.out.println(str.indexOf("e",14));

        // cumledeki 2.c'nin indexini yazdirin
        int ilkcindex = str.indexOf("c");//8
        System.out.println(str.indexOf("c",ilkcindex+1));

        System.out.println( str.indexOf("ali"));//olamayn ne aratırsan arat -1 döner



    }
}
