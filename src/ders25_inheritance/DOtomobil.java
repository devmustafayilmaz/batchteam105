package ders25_inheritance;

public class DOtomobil extends BinekArac{
    public static void main(String[] args) {
        DOtomobil oto1 = new DOtomobil();
        System.out.println(oto1.marka);
        // private ve static'ler inherit edilemezler....
    }


}
