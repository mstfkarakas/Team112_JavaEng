package day17_arrays;

public class C02_Tekrar_String_Eleman_Bulma {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] arr = {"A","A","A","B","B","C"};
        findStringElement(arr,"D");

    }

    public static void findStringElement(String[] array, String element) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(element) ) {
                counter++;
            }
        }
        System.out.println(counter);


    }
}
