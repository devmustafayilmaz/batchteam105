package ders11_ForLoops;

public class C04_Soru {
    public static void main(String[] args) {
        //8'inci soru
        int sayi=130;
        for (int i = 1; i <= sayi; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz\n");
            }else if (i%3==0){
                System.out.print("fizz ");
            }else if (i%5==0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i+" ");
            }

        }

    }
}
