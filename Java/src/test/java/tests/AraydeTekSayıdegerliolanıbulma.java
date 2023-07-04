package tests;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AraydeTekSayıdegerliolanıbulma {
    HashSet<Integer> arrayList = new HashSet<>();
    public int  oddOccurrence(int[] A){
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (arrayList.contains(a)) {
                arrayList.remove(new Integer(a));
            }
            else{
                arrayList.add(a);
            }
        }
        System.out.println(arrayList);
        return arrayList.iterator().next();
    }
    public static void main(String[] args) {
        AraydeTekSayıdegerliolanıbulma arr = new AraydeTekSayıdegerliolanıbulma();
        arr.oddOccurrence(new int[] {9,3,9,3,9,7,9});

    }
}
