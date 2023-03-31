package day31_inheritance;

public class Hemsire extends FMuhasebe{
    String unvan = "Hemsire";

    public void standardMaas(){
        System.out.println("Hemsireler minimum 10000 TL maas alir");
    }
    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 TL katki ile ozel sigorta yaptirabilir");
    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire = new Hemsire();
        hemsire.method();
    }

    public void method() {

        System.out.println(this.unvan);  // this ile bu class'daki unvan calisir.
        System.out.println(this.sgkNo); // Once bu class'a bakar, yoksa parent'a gider cunku extends keyword var.
                                        // Calisan sgkNo belirtilmedi
        System.out.println(super.sgkNo); // Bu class'a hic bakmadan direk parent class'a gider.
                                        // Calisan sgkNo belirtilmedi

        this.standardMaas(); // 10000 TL
        this.fazlaMesai(3);  // Bu class'a bakar, bulamayinca parent'a bakar ve bulur: 600 TL
        this.ozelSigorta(); // Hemsireler aylik 300 TL katki ile ozel sigorta yaptirabilir
        super.ozelSigorta(); // parent class'lari gezecek, EPersonel'de bulacak:
                             // Personelden katki payi alinarak ozel sigorta yapilir
    }
}
