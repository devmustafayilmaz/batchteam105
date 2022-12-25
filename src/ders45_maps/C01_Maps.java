package ders45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class C01_Maps {
    public static void main(String[] args) {
        // verilen bir cümlede kullanilan herbir harfi
        //ve o harfin kullanim miktarini
        // A=5 , b=3... gibi yazdirin..


        String str="javayı balonu patlatmadan bitirelim";
        //output:J=1 , a=7, v=1 , y=1 ........
        String[] harflerArr=str.split("");
        Map<String,Integer>kullanimMiktariMap = new TreeMap<>();
        int sayac=1;
        for (int i = 0; i < harflerArr.length; i++) {
            // ele aldığımız harfin daha önce map e eklenip eklenmediğinş kontrol edelim.
            if (kullanimMiktariMap.containsKey(harflerArr[i])){
                continue;
            }else {
                // kod buraya geldiyse o harf henüz map e eklenmemiştir.
                // o zaman bu harfin kullanım miktarının bulmalıyız
                for (int j = i+1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }

                }
                kullanimMiktariMap.put(harflerArr[i],sayac );
                sayac=1;
            }
        }
        System.out.println(kullanimMiktariMap);

    }
}
