package ders27_Overriding;

public class AvciKuslar extends Kuslar{
    public void hareket(){
        System.out.println("avci kuslar ucarlar");
    }public void beslenme(){
        System.out.println("avci kuslar et yer");
    }public void pence(){
        System.out.println("avci uslarin penceleri vardir.");
    }public void gaga(){
        System.out.println("avci kuslarin gagalari sivridir.");
    }

    public static void main(String[] args) {
        /*
        bir obje olustrulurken constructor ve data turu aynı ise
        hangi metjodun gecerli olduğunun bulmak için o class a gider
        varsa kullaniriz yoksa parent classlara gidilir ilk bulduğunu alır

         */

        AvciKuslar avci1= new AvciKuslar();
        avci1.beslenme();//avci kuslar
        avci1.gaga();//avci kuslar
        avci1.pence();//avci kuslar
        avci1.hareket();//avci kuslar
        avci1.cogalma();//kuslar
        avci1.kanat();//kuslar
        avci1.omur();//DHayvanlar
        avci1.solunum();//kuslar

        Kuslar avci2=new AvciKuslar();
        /*
        bir obje olustrulurken
        data turu ile constructor farkli ise hangi methodun gecerli olacağını bulak icin

        once data turunun olduğu class ve parent larına bakarak o methodu buluruz bulamazsak CTE verir
        bulursak hemen CALİSTİRMAYİZ...
        one calistrimadan o method override edilmiş mşi diye kontrol deriz override edilmişse
        override eden methodu calistiririz.
         */
    }
}
