package tests;

public class Shiftedarray {
    public int[] shiftedarray (int[] A, int k){
        int[] sharray = new int[A.length];
        int pos = -1;
        if (A.length == 1){
            return A;
        }
        if(k>A.length){
            k = k % A.length;

        }
        for (int i = 0; i < A.length; i++) {
            if ((i+k) > A.length - 1) {
                pos = Math.abs(A.length - i - k);
            }
            else{
                pos = i + k;
            }
            sharray[pos] = A[i];
        }
        for (int i = 0; i < sharray.length; i++) {
            System.out.print(sharray[i]);
        }
        return  sharray;


    }
    public static void main(String[] args) {
        Shiftedarray sh = new Shiftedarray();
        sh.shiftedarray(new int[] { 3, 8, 9, 7, 6},3);
    }
}
