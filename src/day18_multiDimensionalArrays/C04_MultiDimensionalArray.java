package day18_multiDimensionalArrays;

public class C04_MultiDimensionalArray {
    public static void main(String[] args) {

        String [][] classes = {{"A","B","G","M"},{"F","P","A","V","Z"},{"K","D","Q"},{"R"},{"X"}};

        // G'yi yazdirin.

        System.out.println(classes[0][2]);  // G

        classes[2][2] = "Y";

        System.out.println(classes[2][2]);

        // Number of students in the first class:

        System.out.println(classes[0].length); // 4

        // Siniflarda toplam kac kisi oludugunu yazdirin:

        int studentSum = 0;

        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {

                studentSum++;

            }
        }

    //  VEYA
        studentSum = 0;  // set back to zero

        for (int i = 0; i < classes.length; i++) {
            studentSum += classes[i].length;
        }
        System.out.println(studentSum);


        System.out.println(studentSum);

    }
}
