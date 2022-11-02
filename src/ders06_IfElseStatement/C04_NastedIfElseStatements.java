package ders06_IfElseStatement;

import java.util.Scanner;

public class C04_NastedIfElseStatements {
    public static void main(String[] args) {
        //- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz:");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        if(cinsiyet=='k' || cinsiyet=='K'){

            if(yas>18 && yas<60){
                System.out.println("Emekli olamazsınız emekli olmak için"+(60-yas)+"yil daha çalışmalısın");
            }else if(yas>60){
                System.out.println("emeklli olabilirsin");
            }else {
                System.out.println("hatali giris yaptınız!!!!");
        }
        }else if (cinsiyet=='e'|| cinsiyet=='E'){
            if(yas>18 && yas<65){
                System.out.println("emekli olamazsınız emekli olmanız için "+(65-yas)+" yil daha çalışmanız lazım");
            }else if(yas>65){
                System.out.println("meekli olabilirsiniz");
            }else {
                System.out.println("yanlış giris yaptınız");
            }

        }
        else{
            System.out.println("hatali cinsiyet girişi lütfen :E/K girin!!");
        }

    }
}
