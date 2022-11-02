package ders11_ForLoops;

public class C03_ForLoops {
    public static void main(String[] args) {
        int sayi=100;
        boolean asalMi=false;

        for (int i = 2; i <=sayi-1 ; i++) {
            if (sayi%i==0){
                asalMi=true;
                break;
            }


        }if (asalMi==false){
            System.out.println("sayi asal sayidir..");

        }else{
            System.out.println("sayi asal degildir");
        }
    }
}
