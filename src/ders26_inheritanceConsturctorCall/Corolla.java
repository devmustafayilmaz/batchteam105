package ders26_inheritanceConsturctorCall;

public class Corolla extends BToyota{
    Corolla(int pconstructor){
        super(5);
        System.out.println("parametreli corolla constructor");

    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("String parametreli corolla constructor");

    }
    public static void main(String[] args) {
        Corolla corolla3=new Corolla("Ilker");



        Corolla corolla1 = new Corolla();
        System.out.println("====================");
        Corolla corolla2 =new Corolla(3);
    }
}
