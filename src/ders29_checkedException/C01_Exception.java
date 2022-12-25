package ders29_checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src/ders29_checkedException/Deneme.txt");
        /*
        chekhed exceptionlarla oluşturma ihtimali olan kodlari yazdiğimizda
        java compile time orada bir hata ihtimali olduğunu görür ve kodun altını kırmızı
        olarak çizer


        bu durumda ikik yöntem vardir:
        1- try catch ile exception ı handle etmektir.
        2 -Java ya sorun ihtimalinin farkinda olduğumuzu ama kodumuza güvendiğimizi ve
        calismaya devam
         */
    }
}
