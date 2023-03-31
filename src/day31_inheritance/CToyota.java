package day31_inheritance;

public class CToyota extends BAraba{
    String str2 = "Toyota";

    protected CToyota(){
        System.out.println("Toyota Parematresiz constructor calisti");
    }
    protected CToyota(int sayi){
        System.out.println("Toyota int Parematreli constructor calisti");
    }
    protected CToyota(String s){
        System.out.println("Toyota String Parematreli constructor calisti");
    }
}
