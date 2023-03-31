package day36_exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class C05_CokluException {
    public static void main(String[] args) {

        String str = "Java her gecen gun guzellesiyor";
        int[] arr = {3, 4, 6, 3, 6, 7, 4, 2, 5, 7};

        // Kullanicidan 0 veya pozitif bir tam sayi isteyin
        // girilen degeri index olarak kullanip
        // str ve arr'nin o index'indeki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi girin");

        // Birbirinden bagimsiz
        // 3 farkli turde exception riski var
        // bunlari farkli sekillerde handle edebiliriz
        //         1- herbirini ayri ayri try-catch yapariz. Bu cok basit kacar. Gecelim.
        //         2- tek bir try, birden fazla catch yapabilirsiniz

        try {
            int index = scan.nextInt();
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisin.");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlar disinda.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen index Array sinirlari disinda.");
        }

// 3rd WAY:       3- tek bir try catch yapip tum exception'lari yakalayacak bir exception turu yazilabilir

        try {
            int index = scan.nextInt();
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            // System.out.println("giris hatali olabilir, index String veya array'in disinda olabilir");
            e.printStackTrace();
            // biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // veya javanin hata kodlarini yazdirabiliriz
        }


    }
}