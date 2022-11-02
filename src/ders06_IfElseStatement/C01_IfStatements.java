package ders06_IfElseStatement;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay isminin ilk harfini giriniz:");
        char ilkHarf = scan.next().charAt(0);

        if(ilkHarf=='n' || ilkHarf=='N')
        {

            System.out.println("Nisan");
        }
        if(ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("ARALIK veya Ağustos");

            // eğer if else yapılarında süslü parantez kullanılmazsa sadece bir satır okur gerisine karışmaz

        }
    }
}
