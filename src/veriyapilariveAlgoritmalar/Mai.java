package veriyapilariveAlgoritmalar;

import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLütfen aşağıdaki işlemlerden birini seçiniz:");
            System.out.println("1. Ekleme");
            System.out.println("2. Silme");
            System.out.println("3. Görüntüleme");
            System.out.println("4. Çıkış");

            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz değeri giriniz: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    int removedData = queue.dequeue();
                    if (removedData != -1) {
                        System.out.println(removedData + " kuyruktan çıkarıldı.");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Tekrar deneyin.");
            }
        }
    }
}
