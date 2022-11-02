package Ders04_matematikselIslemler_incrementDecrement;



public class C01_Datacasting {
    public static void main(String[] args) {

      int input = 1555;
      int birlerBasamagi=0;
      int rakamlarToplami=0;
      birlerBasamagi=input %10;
      rakamlarToplami=rakamlarToplami+birlerBasamagi;
      input=input/10;

        birlerBasamagi=input %10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;

        birlerBasamagi=input %10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;

        birlerBasamagi=input %10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;



        System.out.println("Dort basamaklı sayinin rakamlar toplmai :"+rakamlarToplami);




    }
}
