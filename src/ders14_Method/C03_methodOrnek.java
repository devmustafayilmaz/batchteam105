package ders14_Method;

public class C03_methodOrnek {
    public static void main(String[] args) {
        String str ="JAva candir";

        System.out.println( tersCevirme(str));
    }
    public static String tersCevirme(String str){
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr=tersStr+str.charAt(i);
        }
        return tersStr;

    }





}
