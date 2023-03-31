package day31_inheritance;

public class BAraba {

    String str1 = "Araba";

    protected BAraba(){
        System.out.println("Araba parametresiz constructor calisti");
    }
    protected BAraba(String str){
        System.out.println("Araba parametreli constructor calisti");
    }
    protected BAraba(int a, int b){
        System.out.println("Araba parametreli constructor calisti");
    }
}
