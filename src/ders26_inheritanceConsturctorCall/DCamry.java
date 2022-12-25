package ders26_inheritanceConsturctorCall;

public class DCamry extends BToyota{
    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");
    }
    DCamry(){

    }

    public static void main(String[] args) {
        // eger kullanilamn argumente  uygın bir
        //consturctor parent class ta yoksa
        //CTE verir.
        DCamry camry2=new DCamry("celal");
        System.out.println("===========");
        DCamry camry=new DCamry();
    }
}
