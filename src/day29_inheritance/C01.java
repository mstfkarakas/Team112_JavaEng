package day29_inheritance;
public class C01 {

    public String isim;   // public oldugu icin heryerden ulasilir
    private int sayi;    // private oldugu icin getter ve setter kullanarak read ve write haklari verilmelidir
    public boolean isHappy() {
        return happy;
    }
    public void setHappy(boolean happy) {
        this.happy = happy;
    }
    private boolean happy;
    public int getSayi() {
        return sayi;
    }
    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
}