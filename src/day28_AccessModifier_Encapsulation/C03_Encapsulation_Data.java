package day28_AccessModifier_Encapsulation;

public class C03_Encapsulation_Data {

    static private String isim = "Yildiz Pazarlama";

    private int satisTutari;

    public int getToplamSatis() {
        return toplamSatis;
    }

    private int toplamSatis;

    public int a;


    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;
    }
}
