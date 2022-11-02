package Ders07_TernaryOperator_Switch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        //kullanicidan harf alin
        //alinan harf J;D;K dan biri ise yukaridaki kelimeleri yazdirin
        //alişnan harf J,D,K dan biri degilse "geçersiz harf" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("LUtfen bir harf girin :");
        char harf=scan.next().charAt(0);

        switch(harf){
            case 'J' :
            case 'j' :

                System.out.println("Java");
                break;
            case 'D' :
            case 'd' :

                System.out.println("Development");
                break;
            case 'K' :
            case 'k' :
                System.out.println("Kit");
                break;
            default:
                System.out.println("geçeresiz giris :");
        }


    }
}
