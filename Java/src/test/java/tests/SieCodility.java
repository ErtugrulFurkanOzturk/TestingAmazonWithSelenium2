package tests;

import java.util.HashSet;

public class SieCodility {

    public boolean solution(int N, int[] A, int[] B) {
        boolean flag = true;
        HashSet<Integer> nums = new HashSet<Integer>();
        if (A[0] == 1) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j <B.length ; j++) {
                    if (A[i] + 1 == B[j] || A[i] - 1 == B[j]) {
                        nums.add(A[i]);
                    }
                }
            }

            if (nums.size() == N || (N <= 3 && nums.size() == N - 1)) {
                flag = true;
            }
            else
            {
                flag = false;
            }
        }
        else{
            flag = false;
        }

        return flag;

    }

    public static void main(String[] args) {
        SieCodility si = new SieCodility();
      //  System.out.println(si.solution(4,new int[] {1,2,4,4,3},new int[2,3,1,3,1]));

    }
}
