package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class codility {
    public int solution(int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 1; i <= A.length+1 ; i++) {
            nums.add(i);
        }

        for (int a : A) {
            nums.remove(new Integer(a));
        }

       return nums.iterator().next();


    }
    public static void main(String[] args) {
        codility co = new codility();
        // enküçük pozitif sayıyı döndür a arrayini içermeyen
        System.out.println(co.solution(new int[] { 2, 3, 1, 5}));


    }
}
