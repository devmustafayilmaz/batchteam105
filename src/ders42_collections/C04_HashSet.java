package ders42_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_HashSet {
    public static void main(String[] args) {
    //verilen bir Array in tekrar eden elementlerini silip
        // her eleman sadece 1 kere kullanildiği hale getirilir.
        int [] arr = {6,4,4,5,6,7,5,55,4,4,3,33,32,4,5,6,8,9,87,6,4};
        Set<Integer>geciciSet=new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }
        int [] geciciArray=new int[geciciSet.size()];

        int index=0;
        for (Integer each:geciciSet
             ) {
            geciciArray[index]=each;
            index++;
        }
        arr=geciciArray;
        System.out.println(Arrays.toString(arr));
    }
}
