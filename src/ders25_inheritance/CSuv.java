package ders25_inheritance;

public class CSuv extends BinekArac{


    public static void main(String[] args) {


        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.model);
        System.out.println(suv1.motor);
        System.out.println(suv1.yakit);
        System.out.println(suv1.yil);
        suv1.hiz("benzin");
        suv1.teker();

        CSuv suv2 = new CSuv();
        suv2.marka = "toyota";
        suv2.model = "RAV4";
        suv2.motor = "1.6";
        suv2.plaka = "06 ANK 006";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);





    }
    public void hiz(String yakit){
        if(yakit.equalsIgnoreCase("benzin")){
            System.out.println("benzinlilier max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel suvlar 260 yapar");
        }else if (yakit.equalsIgnoreCase("hibrit")){
            System.out.println("hibrit suvlar 220 yapar");
        }else{
            System.out.println("yakit belli değil max hiz yok");
        }
    }
}
