package day17_arrays;

public class C03_Longest_Element_Array {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] text = {"Melike","Burkay","Inci","Eda","Emre","Mustafa"};
        String[] text2 = {"Melike","Burkay","Inci","Eda","Emre","Mustafa","El","Abdurrahman","Su","Albulmuttalip","Al"};

        longestShortestElement(text);
        longestShortestElement(text2);

    }
    public static void longestShortestElement(String[] array){
        String longestWord = array[0];
        String shortestWord = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i].length()>longestWord.length()){
                longestWord = array[i];
            }
            if (array[i].length()<=shortestWord.length()){
                shortestWord = array[i];
            }

        }
        System.out.println("Longest word in the Array is " +  longestWord);
        System.out.println("Shortest word in the Array is " +  shortestWord);


    }
}
