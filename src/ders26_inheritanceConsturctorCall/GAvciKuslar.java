package ders26_inheritanceConsturctorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {

        GAvciKuslar avci1 = new GAvciKuslar();

        FKuslar avci2=new GAvciKuslar();

        EHayvanlar avci3=new GAvciKuslar();
        System.out.println(avci3.isim);
    }
}
