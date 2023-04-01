package day38_exceptions_garbageCollector;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);  // -2147483648
        // MIN_VALUE degistirilemez. final'dir. CTRL+ click ile bakilabilir.

        try {
            System.out.println(10/0); // 10/5 yaparsak try blogu ve finally blogu calisir.
                                      // Ama  10/0 yaparsak exception vereceginden, catch ve finally bloklari calisir.
                                      // finally blogu her halukarda calisir.
            System.out.println("Bolmenin sonrasindaki satir");
        } catch (Exception e) {
            System.out.println("Catch blogu calisti");
        } finally {
            System.out.println("Finally blogu calisti");
        }

    }
}
