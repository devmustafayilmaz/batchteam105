package ders29_checkedException;

import java.util.Scanner;

public class C04_IndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 6, 7};
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir index giriniz:");
        int index = 0;
        try {
            index = scan.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("indis dışında bir sayi girme!!");
            System.out.println("index karşılığı array degeri:" + arr[index]);
            //Interface bir child parent Interface'deki abstract merhod'u override edebilir
            //Ama ikisininde body'si olmadığından bu işlemin bir anlamı yoktur.
        }

    }
}