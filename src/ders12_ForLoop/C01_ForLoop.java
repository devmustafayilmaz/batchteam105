package ders12_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        String input="Java ne kadar guzel";
        for (int i = input.length()-1; i >= 0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
