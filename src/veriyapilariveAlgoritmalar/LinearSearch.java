package veriyapilariveAlgoritmalar;

import java.util.Scanner;

public class LinearSearch{
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Hedef elemanı bulduğumuzda dizinin indeksini döndürür
            }
        }
        return -1; // Hedef elemanı bulamazsak -1 döndürür
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Dizinin boyutunu ve elemanlarını kullanıcıdan isteyiniz.
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            arr[i] = scanner.nextInt();
        }

        // b) Dizide aranacak olan elemanı kullanıcıdan isteyiniz.
        System.out.print("Aranacak elemanı girin: ");
        int aranan = scanner.nextInt();

        // c) Aranılan elemanın dizide olup olmadığının kontrolünü Linear Search kullanarak yapınız.
        int sonuc = linearSearch(arr, aranan);

        if (sonuc != -1) {
            System.out.println(aranan + " değeri dizinin " + (sonuc + 1) + ". indeksinde bulunuyor.");
        } else {
            System.out.println(aranan + " değeri dizide bulunamadı.");
        }
    }

}