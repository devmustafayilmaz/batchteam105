package ders14_Method;

import java.util.Scanner;

public class C02_methodolusturma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= "kale";
        String str1= "şato";
        System.out.println( birlestirMe(str, str1));
        System.out.println( birlestirMe("bu da ","oldu"));
    } public static String birlestirMe(String str,String str1){

        return str+" "+str1;
    }
}
