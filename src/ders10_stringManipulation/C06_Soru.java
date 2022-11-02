package ders10_stringManipulation;

public class C06_Soru {
    public static void main(String[] args) {
        // 3'üncü soru// Soru 1 : Kullanicidan bir cumle alin
        //// - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //// - cumlede is geciyorsa, "calismak guzeldir"
        //// - ikisini de iceriyorsa "Hem ev lazim hem is"
        //// - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        String cumle = "Eve geldim işler birikmiş";
        String cumleCopy=cumle.toLowerCase();
        if (cumleCopy.contains("ev")&&cumleCopy.contains("is")){
            System.out.println("Hem ev lazim hem is");
        }
    }
}
