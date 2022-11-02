package ders12_ForLoop;

public class C02_StringTersineCevir {
    public static void main(String[] args) {
        String input = "Java her geçen gun guzelleşiyor";
        String tersInput="";
        for (int i = input.length()-1; i >0 ; i--) {

            tersInput+=input.substring(i,i+1);


        }System.out.println("ters input :"+tersInput);
    }
}
