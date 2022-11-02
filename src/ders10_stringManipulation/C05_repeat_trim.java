package ders10_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str ="Java guzeldir\n ";
        System.out.println(str.repeat(4));
        str="   JAva guzeldir   ";
        System.out.println(str.length());
        str=str.trim();//baştaki ve sondaki boşluklari siliyor...
        System.out.println(str);
        System.out.println(str.length());
        System.out.println();


    }
}
