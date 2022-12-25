package ders40_Interface;

public class I02_concreteChildClassInterface implements I01_Interface  {
    public static void main(String[] args) {
        System.out.println(mesaj);//hello interface
        //sayi=23; interfacler de atanan değerler public static ve final dır değiştirilemezler.
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
