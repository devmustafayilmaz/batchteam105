package ders09_StringManipulation;

public class C01_concatination {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl=true;
        int sayi = 20;
        double dbl=3.54;
        System.out.println(str1+bl+sayi);
        System.out.println(""+bl+sayi);
        System.out.println(sayi+dbl);
        // String dışındaki  data türlerini toplmaya izin vermeyebilir.
        //System.out.println(str1.concat(bl));

        // concat() sadece string variable'lari birleştirmeye yarar.
        System.out.println(str1.concat("").concat(str2));

    }
}
