package day31_inheritance;

public class FMuhasebe extends EPersonel{
    String sgkNo = "Calisan sgkNo belirtilmedi";
    boolean raporluMu;

    public void fazlaMesai(int fazlaMesaitSaati) {
        System.out.println(fazlaMesaitSaati*200);
    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*500);
    }
}
