package ders08_StringManipulation;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";
        String str3 =  "ALI";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase("Ali can"));


        /*
        equlsIgnoreCase ayni metnin buyuk kuçuk harf kullnaılarak oluşturulan
        farkli yazilimlarini birbirine esit olarak kabul eder.

        yani equalsIgnoreCase icin ali, Ali, ALI gibi birbirine esittir.
        ama kelimede farklilik varsa tolera edemez
        a li , ali birbirine esit degildir. ya da ALi, AL i gibi...
         */
    }
}
