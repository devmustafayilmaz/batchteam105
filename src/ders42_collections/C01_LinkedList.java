package ders42_collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("K");
        ll1.add("T");


        //LİnkedList 3 tane interface i implements etmiştir.
        //List , Queue , Deque interfaceleri
        //Dolayisiyla bu interface2lerden sonra gelen ilk concrete class olduğundan
        //bu 3 interface deki tum abstract metjod lari override etmiştir


        List<String> ll2 = new LinkedList<>();
        ll2.add("R");//[R]
        ll2.add("Z");
        ll2.add(0,"A");

        ll2.addAll(2,ll1);
        ll2.set(3,"M");
        System.out.println(ll2.get(1));
        System.out.println(ll2);
        System.out.println(ll2.retainAll(ll1));//ll1 de olanlari tutuyo gerikalan siliniyor.



    }
}
