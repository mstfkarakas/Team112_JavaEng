package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1 = new ADoktor();
        System.out.println(dok1.militaryServiceDone);   // deger atamadik, default olarak false atar.

        dok1.name = "Kemal";
        dok1.surname = "Yilmaz";
        dok1.birthYear = 1980;

    //  System.out.println(name);  // no name in this method.

        System.out.println(dok1.name); // Kemal

        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.name); //  null

        dok2.surname = "Celik";
        System.out.println(dok2.surname);  // Celik

        System.out.println(dok1.faculty);  //
        System.out.println(dok2.faculty);  //

        dok1.name = "Burcu";
        System.out.println(dok2.name);  // null

        ADoktor dok3 = new ADoktor();
        System.out.println(dok3.birthYear);  // default olarak sifir yazdirir.
        System.out.println(dok3.faculty); // atama yampasak da,
                // static variable cati variable oldugu icin her doktorda "Medicine" yazdirir.

        // faculty kismi sari renge boyaniyor cunkum static variable'i class ismi olan ADoktor ile cagirmak lazim.

        System.out.println(ADoktor.faculty); // Sariya boyamadi.
    }
}
