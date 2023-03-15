package day14_methodOverloading_whileLoops;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
            // - ilk harf kucuk harf olmali
            // - son harf buyuk harf olmali
            // - bosluk icermemeli
            // - 8 karakter veya daha uzun olmali


        Scanner scan = new Scanner(System.in);

        String password = "";
        int flag = 0;
        int attemptNumber = 0;

        while (flag != 4) {
            flag = 0;
            System.out.print("Enter a password: ");
            password = scan.nextLine();
            if (password.charAt(0)>='a' && password.charAt(0)<='z') {  //ilk harf kucuk harf olmali
                flag++;
            } else {
                System.out.println("ilk harf kucuk harf olmali");
            }
            if (password.charAt(password.length()-1)>='A' && password.charAt(password.length()-1)<='Z') { //son harf buyuk harf olmali
                flag++;
            }else {
                System.out.println("son karakter buyuk harf olmali");
            }
            if (password.contains(" ")) { // bosluk icermemeli
                System.out.println("password bosluk icermemeli");
            }else {
                flag++;
            }
            if (password.length()>=8) {  // 8 karakter veya daha uzun olmali
                flag++;
            }else {
                System.out.println("8 karakter veya daha uzun olmali");
            }
            attemptNumber++;

        }
        System.out.println("Bravo, you created a password in " + attemptNumber + " trial(s)");


    }
}
