package day43_Collections;

import java.util.*;

public class C02_MixSet {
    public static void main(String[] args) {

        Set<Object> mixSet = new HashSet<>(); // Object turunde olusturduk, her tur data koyucaz
                                            // ama bir kutuya bir suru esya koymak gibi karisik olacak.

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int[] arr = new int[3];
        mixSet.add(arr);
        arr[1] = 71;
        arr[2] = 34;

        List<Object> mixList = new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);

        mixSet.add(mixList);

        System.out.println(mixList); // [Hava, 24]
        System.out.println(mixSet);  // [Java, [Hava, 24], S, 12, [I@4dd8dc3, true]
//  Collections objeleri bir arada tutan yapilardir.

        System.out.println(mixSet.size()); // 6

        System.out.println(mixSet.contains(24)); // false verdi. Set'in icindeki listin elemanina ulasamadik.
        System.out.println(mixSet.contains(12)); // true

        System.out.println(Arrays.toString(arr)); // [0, 71, 34] Array'in kac elemani olursa olsun, mixSet'in icinde Array'i tek eleman olarak goruyor.

        // Data turu olarak object secilirse icine her data turunden element kullanilabilir,
        // Ancak elementlere ulasilamaz ve update edilemez veya cok zor olur.

    }
}