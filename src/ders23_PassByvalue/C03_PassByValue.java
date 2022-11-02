package ders23_PassByvalue;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        // verilen bir arrayin elemntlerni 5 artirip sonra yazdiran bir method olulsturun

        int [] arr={3,4,5};

        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);
        System.out.println("methoddan sonra ise :"+Arrays.toString(arr));

    }

    public static void elementleri5Artir(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
