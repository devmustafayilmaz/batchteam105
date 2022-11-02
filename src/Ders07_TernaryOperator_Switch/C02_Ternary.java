package Ders07_TernaryOperator_Switch;

public class C02_Ternary {
    public static void main(String[] args) {
        int kenar1=10;
        int kenar2=12;
        int kenar3=10;
        System.out.println(kenar1==kenar2 &&kenar3==kenar2 ? "eşekanr ucgen" : "eşkenar üçgen değil");

        int sayi1=14;
        int sayi2=12;
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
