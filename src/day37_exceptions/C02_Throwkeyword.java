package day37_exceptions;

public class C02_Throwkeyword {
    public static void main(String[] args) {

        String a = null;
        String b = "";


        try {
            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException(e);
                }
                System.out.println("Null Point vardir. Islem yapilamaz.");
            }
        } catch (RuntimeException e) {
                System.out.println(" Throw keyword calisti.");
        }
    }
}
