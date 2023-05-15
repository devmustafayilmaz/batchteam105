package veriyapilariveAlgoritmalar;

import java.util.Arrays;


    public class BinarySearch {
        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == target) {
                    return mid; // Hedef elemanı bulduğumuzda dizinin indeksini döndürür
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return -1; // Hedef elemanı bulamazsak -1 döndürür
        }

        public static void main(String[] args) {
            int[] dizi = {4, 8, 3, 84, 47, 76, 9, 24, 68};
            Arrays.sort(dizi); // Diziyi sıralamak için Arrays.sort() kullanılır

            int aranan = 76;

            int sonuc = binarySearch(dizi, aranan);

            if (sonuc != -1) {
                System.out.println(aranan + " değeri dizinin " + (sonuc + 1) + ". indeksinde bulunuyor.");
            } else {
                System.out.println(aranan + " değeri dizide bulunamadı.");
            }
        }
    }


