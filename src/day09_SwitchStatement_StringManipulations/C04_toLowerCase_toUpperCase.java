package day09_SwitchStatement_StringManipulations;

import java.util.Locale;

public class C04_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java is Life";

        // print str in capital letters
        System.out.println(str.toUpperCase()); // JAVA İS LİFE

        System.out.println( str); // Java is Life

        str = str.toUpperCase(); // If we don't make the assingment we do not change the original value
        System.out.println(str); // JAVA İS LİFE

        System.out.println(str.toLowerCase()); // java is life
        str = str.toLowerCase(); // java is life

        System.out.println(str.toUpperCase(Locale.ENGLISH)); // JAVA IS LIFE
        System.out.println(str.toUpperCase(Locale.CHINA)); // JAVA IS LIFE








    }
}
