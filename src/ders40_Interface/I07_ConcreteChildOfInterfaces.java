package ders40_Interface;

public class I07_ConcreteChildOfInterfaces implements I05_Interface,I06_Interface{
    /*
    1- bir class sadece bir class a extends edilebilir.
    2- Concrete child class implement ettiği tum interfacelerdeki  methodları override etmek zorundadır.
    -iki interface de ayni isimde ve ayni return type'a sahip
    methodlardan hangisini override ettiği onemli değildir.
    ancak isimler ayni return type'ler farkli olduğundan
    iki interface i birden implement etmemiz mumkun degildir
    bu durumda
    *) ya child calsstan bu ikik interface i implements etmekten vazgeçmelisiniz
    veya sisteme müdahale hakkınız varsa müdahale ederek değiştirin
    3- child classtan parent interfacedeki variableları kullanmak istersem
    aynı isimde iki interface de de variable varsa tercihinizi belirtmelisiniz
    interfaceIsmi.variableIsmi şeklinde tercihinizi belirtmelisiniz.
     */
    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I06_Interface.SAYI);
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
