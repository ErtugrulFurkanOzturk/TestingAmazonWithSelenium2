package tests;

import java.util.HashSet;
import java.util.Iterator;

public class SayınınÇarpanlarınıBulma {
    public int CountFactors (int A){
        HashSet<Integer> nums = new HashSet<Integer>();
        int counter = 0;
        for (int i = 1; i <= A; i++) {
            if (A%i == 0) {
               nums.add(i);
                counter++;

            }
        }
        Iterator itr = nums.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        return counter;
    }

    public static void main(String[] args) {
        SayınınÇarpanlarınıBulma arr = new SayınınÇarpanlarınıBulma();
        System.out.println(arr.CountFactors(24));
    }
}
