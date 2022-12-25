package ders28_polymorphism;

public class BChild extends AParents{

    public void method1() {
        System.out.println("Child class method1");
    }


    @Override
    public void method3() {
        //super.method3();
        //overriding varsa parent ve child classlardaki
        //overridden ve overriding lerden sadece biri çalışır.
        //eğer ikisini birden çalıştırmak isterseniz
        //super.overridinMethodIsmi yazilir.
    }

    public void method2(int a) {
        System.out.println("child class method2");
        //overriding olabilmesi için hem method isminin hem de method signaturenin ayni olmasi gereklidir.
    }
    public void method2(String isim){
        System.out.println("child method2");
    }
}
