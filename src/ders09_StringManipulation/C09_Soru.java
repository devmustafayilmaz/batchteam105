package ders09_StringManipulation;

public class C09_Soru {
    public static void main(String[] args) {
        String cumle="Java cok guzel cok";
        String metin ="cok";
        int ilkIndex =cumle.indexOf(metin);
        int ikinciIndex=cumle.lastIndexOf(metin);
        if (ilkIndex==(-1)){
            System.out.println("cumle mtni içermiyor");
        } else if (ilkIndex==ikinciIndex) {
            System.out.println("cumle metni sadece 1 kere içeriyor");

        }else {

            System.out.println("cumle metni birden fazla içeriyor...");
        }
    }
}
