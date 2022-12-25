package ders24_encapsulation;

public class DParent {

    String isim="Mustafa";
    int yas=24;
    boolean isEnough=true;

    public static void main(String[] args) {
        Aencapsulation src=new Aencapsulation();
        System.out.println(src.getHastaIsmi());
        src.setHastaUcreti(200);
        System.out.println(src.getHastaUcreti());

    }


}
