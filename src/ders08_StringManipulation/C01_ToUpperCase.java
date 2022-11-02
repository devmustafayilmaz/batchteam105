package ders08_StringManipulation;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class C01_ToUpperCase {
    public static void main(String[] args) {
        String str = " Java mutluluktur.";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        str="ince mehmet ";
        str=str.toUpperCase();
        System.out.println(str);

        str=str.toLowerCase();
        System.out.println(str);
        System.out.println(str.toUpperCase(Locale.CHINA));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));




    }
}
