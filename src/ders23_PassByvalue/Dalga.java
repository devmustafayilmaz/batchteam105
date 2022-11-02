package ders23_PassByvalue;

public class Dalga {
    public static void main(String[] args) {
        int [] dizi= {1,2,3};

        int [] dizi2= {3,4,5};

        dizi=dizi2;
        ++dizi[0];
        System.out.println(dizi2[0]);


        int data=10;
        int data2=20;
        data=data2;
        data++;
        System.out.println(data2);
    }
}
