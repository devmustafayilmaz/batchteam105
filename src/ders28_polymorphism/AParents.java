package ders28_polymorphism;

public class AParents {
    public void method1() {
        System.out.println("parent class method1");
    }
    public void method2(String str) {
        System.out.println("parent class method2");
    }
     void method3(){
        System.out.println("parent class method3");
    }

    public static void main(String[] args) {
        AParents p = new BChild();
        p.method1();

    }
}
