package ders24_encapsulation;

public class EChild extends DParent{
    /*
    javadaki inheritance ın insanlardan en büyük farki :
    child class parent ının seçer.
    -siz bir class oluşturduğunuzda daha önce oluşturulmuş class'lardan
    tum özellikleri inherit etmek istediğiniz
    class'i parent edinirsiniz.
    Bir class baska bir class'i inherit etmek sgtediğinde extends keyword ile bunu deklare eder.

     */
    public static void main(String[] args) {
        EChild child1=new EChild();
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;
        System.out.println(child1.yas);
    }
}
