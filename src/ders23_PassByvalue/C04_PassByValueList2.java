package ders23_PassByvalue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {
        // bir method oluşturalım
        // methodda yeni bir liste oluştruun
        //listeye sayialr listesindeki degerlerin 5 fazlasini element olarak atayin
        //sonra listesine deger olarak yeni list i atayin ve sayilar listini yazin


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        yeniListDegeriAta(sayilar);

        System.out.println( "method call dan sonra list : "+sayilar);

    }
    public static void yeniListDegeriAta(List<Integer>sayilar){
        List<Integer>yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        sayilar=yeniList;
        System.out.println("methodda sayilar listesiin son hali : "+sayilar);
    }
}
