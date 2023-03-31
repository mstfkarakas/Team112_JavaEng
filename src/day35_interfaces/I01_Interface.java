package day35_interfaces;

public interface I01_Interface {

    static int sayi = 10 ;  // no need for static keyword
    final String str = "Java Candir";  // final variable'a bastan deger atamak zorundayiz.
    public static final boolean b = true;  // no need for public, static and final keywords

    // Interface'de butun variable'ler PUBLIC, STATIC ve FINAL'dir. Yazsan da yazmasan da.

    // Interface'de tum variable'lar (Yazilmasa bile) public, static ve final'dir
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir
    // bu ozellikler standart olarak tum variable'lara tanimlandigindan,
    // bu tanimlamalari yapmak gerekli degildir (intelliJ gri yapti)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum method'lar da standart olarak public ve abstract'tir (yazilmasa bile)

}
