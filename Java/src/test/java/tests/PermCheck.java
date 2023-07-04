package tests;

import java.util.HashSet;

public class PermCheck {
    public int permcheck(int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 1; i <= A.length; i++) {
            nums.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            if (nums.contains(A[i])) {
                nums.remove(A[i]);
            }
        }
        if (nums .isEmpty()) {
            System.out.println("it is perm");
        }
        else{
            System.out.println("it is not perm");
        }
        return  0;
    }

    public static void main(String[] args) {
        PermCheck pe = new PermCheck();
        System.out.println(pe.permcheck(new int[]{4,1,5,2}));
    }
}
