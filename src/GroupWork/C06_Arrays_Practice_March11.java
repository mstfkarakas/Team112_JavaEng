package GroupWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Arrays_Practice_March11 {
    public static void main(String[] args) {
        /*
     8. Given
        String text = "Pages you view in this window won't appear in the browser history and they won't leave other traces"
                    Hint: Use the split() method in order to convert it into an array.
       a) Find the count of the words in the given text
       b) Print the first and last word in the given text
       c) Print all the words until the word history
       d) Print the longest word in the given text
       e) Print only the first two characters of each word in the given text
       f) Print only the character of each word in the array

         */
        String text = "Pages you view in this window won't appear in the browser history and they won't leave other traces";


        String[] str = text.split(" ");
        System.out.println(Arrays.toString(str));


  //    a) Find the count of the words in the given text
        System.out.println(str.length);         // 18

  //    b) Print the first and last word in the given text
        System.out.println(str[0]);             // Pages
        System.out.println(str[str.length-1]);  // traces

  //    c) Print all the words until the word history

//        String[] str1 = text.split("history");
//        System.out.println(Arrays.toString(str1));
//        System.out.println(str1[0]);  // words until the word history = Pages you view in this window won't appear in the browser

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("history")) {
               break;        // "history" kelimesine kadar olanlari gezdi, asagida yazdirdi.
     //        continue;     // "history" kelimesini igrore etti gecti.
            }
            System.out.print(str[i] + " ");
        }

        System.out.println("----");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("history") || str[i].equals("leave")) {
                continue;
            }
            System.out.print(str[i] + " ");
        }

  //    d) Print the longest word in the given text
        String longestWord = str[0];

        for (int i = 0; i < str.length; i++) {
            if (str[i].length()>longestWord.length()) {
                longestWord = str[i];
            }
        }
        System.out.println("Longest word is " + longestWord);


  //    e) Print only the first two characters of each word in the given text

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].substring(0,2) + " ");
        }

        System.out.println("------");
  //    f) Print only the character of each word in the array

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                System.out.print(str[i].charAt(j) + " ");
            }
        }
    }
}