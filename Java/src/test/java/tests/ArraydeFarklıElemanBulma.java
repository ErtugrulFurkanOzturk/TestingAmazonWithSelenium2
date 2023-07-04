package tests;

import java.util.HashSet;

public class ArraydeFarklıElemanBulma {
    public int Distinct (int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            nums.add(A[i]);
        }
        return nums.size();
    }

    public static void main(String[] args) {
        ArraydeFarklıElemanBulma arr = new ArraydeFarklıElemanBulma();
        System.out.println(arr.Distinct(new int[] {9,3,9,3,9,7,9}));
    }
}
