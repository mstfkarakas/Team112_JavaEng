package day43_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_HashSet_treeSet {
    public static void main(String[] args) {

        Random rndm = new Random();

        Set<Integer> hashSet = new HashSet();
        Set<Integer> treeSet = new TreeSet<>();

        int sayi;
        Long hashStart = System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi = rndm.nextInt(1250000);
            hashSet.add(sayi);
        }
        Long hashFinish = System.currentTimeMillis();
        Long treeStart = System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi = rndm.nextInt(1250000);
            treeSet.add(sayi);
        }
        Long treeFinish = System.currentTimeMillis();

        System.out.println("Hash islem suresi: " + (hashFinish-hashStart));
        System.out.println("Tree islem suresi: " + (treeFinish-treeStart));
        
    }
}
