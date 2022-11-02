package ders10_stringManipulation;

public class C04_replaceALL {
    public static void main(String[] args) {
        // kullanıcının girdiği metinde harf dışında kalan
        //tüm karakterleri temizleyen bir kod yazın
        // not: space silinmemeli!!
        String input ="Ja5+va cok 1*guzel";
        input=input.replaceAll("\\d","");
        input=input.replace(" ","5");
        input=input.replaceAll("\\W","");
        input=input.replace("5"," ");
        System.out.println(input);

        System.out.println(input);



    }
}
