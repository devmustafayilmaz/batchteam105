package ders06_IfElseStatement;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        char cinsiyet ='E';
        int yas=60;
        if(cinsiyet=='E' && yas<65 && yas>0){
            System.out.println("emekli olabilirsin");
        }else if(cinsiyet=='E'&&yas<65&&yas>15){
            System.out.println("emekli olmak için daha" + (65-yas)+"kadar çalışmalısın");
        }else
            System.out.println("emekli olmazsın");

    }
}
