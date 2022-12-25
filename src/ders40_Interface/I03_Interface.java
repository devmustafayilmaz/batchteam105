package ders40_Interface;

public interface I03_Interface extends I01_Interface {
    //eger bir interface'i başka bir interface'in child i yapmak isterseniz
    //extends keyword kullanilir.


    void method1();
    //interface bir  child parent interface'deki
    //abstract methodu override edebilir ama
    //ikisinin de body'si olmadiğinden
    // bu işlemin bir anlami yoktur.
    int method4();
    boolean method5();

}
