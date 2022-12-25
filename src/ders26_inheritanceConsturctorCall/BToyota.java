package ders26_inheritanceConsturctorCall;

public class BToyota extends Araba {
    BToyota()
    {
        System.out.println("parametresiz toyota constructor");
    }
    BToyota(String cte){
        super("mehmet");
        System.out.println("string parametreli constructor");
    }
    BToyota(int pt){
        System.out.println("parametreli constructor");
    }
}
