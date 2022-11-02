package ders06_IfElseStatement;

public class C05_NastedIfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin
        int urunAdedi = 9;
        double listeFiyati = 12.5;
        boolean kartVarMi=false;
        double toplamFiyat=0;
        if(kartVarMi ){
            if(urunAdedi>10){
            toplamFiyat=urunAdedi*listeFiyati*(0.8);
            System.out.println("%20 indirimli fiyatiniz : "+toplamFiyat+ "dır.");
            }
            else if( 0<urunAdedi &&  urunAdedi<=10){
                toplamFiyat=urunAdedi*listeFiyati*(0.85);
                System.out.println("%15 indirimli fiyatınız: "+toplamFiyat+" dır");

            }else {
                System.out.println("hatali giriş yaptınız!!");
            }
        }else{

            if(urunAdedi>10){
                toplamFiyat=urunAdedi*listeFiyati*(0.85);
                System.out.println("%15 indirimli fiyatınız: "+toplamFiyat+" dır");
            }else if (urunAdedi>0 &&urunAdedi<=10){
                toplamFiyat=urunAdedi*listeFiyati*(0.90);
                System.out.println("%10 indirimli fiyatınız:"+toplamFiyat+" dır");
            }else {
                System.out.println("hatali giriş yaptınız!!");
            }
        }



    }
}
