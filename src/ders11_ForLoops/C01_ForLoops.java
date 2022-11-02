package ders11_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {

        String str="Java";

        //System.out.println(str.repeat(10));
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("-------");

        for (int i = 10; i < 100 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("----");
        for (int i = 13; i <100 ; i+=7) {
            System.out.print(i+" ");

        }
        System.out.println("----");
        for (int i = 0; i <=10 ; i++) {
            System.out.print(i*i+" ");

        }
        System.out.println(" ");
        int sayi=10;
        int faktoriyel=1;
        for (int i = sayi; i >1 ; i--) {
            faktoriyel*=i;
        }
        System.out.print(faktoriyel+" ");
        System.out.println(" ");
        // 1 den 100'e (sinirlar dahil)kadar olan sayilari toplayın..

        int toplam =0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.print(toplam);

    }
}
