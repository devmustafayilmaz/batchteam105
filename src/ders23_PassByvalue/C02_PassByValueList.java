package ders23_PassByvalue;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {
        // bir method olusturalim methodda Listteki sayilari beş artıralim
        // ve methodda listenin son halini yazdiralim...


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elemntleri5artir(sayilar);

    }
    public static void elemntleri5artir(List<Integer>sayilar){

        for (int i = 0; i < sayilar.size(); i++) {
                sayilar.set(i,sayilar.get(i)+5);

        }System.out.println(sayilar);

    }
}
