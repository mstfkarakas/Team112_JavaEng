package day17_arrays;

public class C02_Array_Elem_Bulma_Tekrar {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int [] arr = {1,1,1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,};
        findElement(arr,5);

        String[] arr2 = {"E", "E", "E","D", "D"};
  //    findElement(arr2,"E");   // Bu calismaz, cunku metod'da int turunu sectik ama bu String.

    }
    public static void findElement(int[] array,int element){

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]==element){
                counter++;
            }

        }
        System.out.println(counter);
    }


}
