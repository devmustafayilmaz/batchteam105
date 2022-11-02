package ders09_StringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        sifre kontrolu yapan bir program hazırlayin
        1- mail  isareti icermiyorsa gecesiz email
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3
         */
        String email ="ahmet@bulutluoz.com";
        if (!email.contains("@")){
            System.out.println("gecersiz email");
            
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz:");
        } else if (email.endsWith("@gmail.com")) {

            System.out.println("yazim hatasi ");
        }else {
            System.out.println("mail dogru girilmistir");
        }

    }
    }
