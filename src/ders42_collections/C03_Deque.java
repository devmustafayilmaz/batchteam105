package ders42_collections;

import java.util.Deque;

import java.util.LinkedList;

public class C03_Deque {
    public static void main(String[] args) {
        Deque<String>urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("çikolatalı gofret");
        urunler.add("Cokoprens");

        //tum urunlerin basina "Y" ekleyelim.

        String eleman="";
        Deque<String> geciciDeque=new LinkedList();

        while(eleman!=null){
            eleman=urunler.poll();
            if (eleman!=null){
                eleman="Y "+eleman;
                geciciDeque.add(eleman);
            }

        }
        urunler=geciciDeque;
        System.out.println(urunler);
    }
}
