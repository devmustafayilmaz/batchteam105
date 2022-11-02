package ders13_NestedForLoop;

public class C05_nestedfor_loop {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = i; j <10 ; j++) {
                System.out.print("");
            }for (int k = 1; k < 10; k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
