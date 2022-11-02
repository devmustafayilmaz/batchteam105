package Ders07_TernaryOperator_Switch;

public class C03_NestedTernary {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya
        // cift sayi degil seceneklerinden
        // uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya
        // 3 basamakli degil seceneklerinden uygun
        // olani yazdirin
        int sayi=-231;
        /*if (sayi>0){
            System.out.println(sayi%2==0 ? "çift sayi" :"çift sayi değil");

        }else{
            System.out.println(sayi<-99 &&sayi>-1000 ? "üç basmaklı" : "üç bsamaklı değil");

        }*/
        String sonuc =sayi>0 ?
                sayi%2==0 ? "çift sayi" :"çift sayi değil"
                :
                sayi<-99 &&sayi>-1000 ? "üç basmaklı" : "üç bsamaklı değil";
    }
}
