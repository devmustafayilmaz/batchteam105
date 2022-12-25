package ders24_encapsulation;

public class Aencapsulation {
    public Aencapsulation() {
    }

    public String getHastaIsmi() {
        return hastaIsmi;
    }

    public int setHastaUcreti(int i) {
        return hastaUcreti=hastaUcreti;
    }
    public int getHastaUcreti(){

        return hastaUcreti;
    }

    private String hastaIsmi="Yildiz Hastanesi";
    //hastane ismi gorulebilsin ama degistirelemesin
    private int hastaUcreti;
    private int toplamUcret=500;

    //hasta ucretleride girisi yapılabilsin ama ucreti sigortadan alınacagi icin personel hasta ucretlerini
    //goremesin
    String hemsireIsmi;
    String hemsireAdresi;
    // bu instance variable'larada herkes ulasabilsin.
    //bu durumda pubic yapmak akla gelen ilk cozum olacaktır.


}
