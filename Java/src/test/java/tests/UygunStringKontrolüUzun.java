package tests;

import java.util.HashSet;

public class UygunStringKontrolüUzun {
    public int LongestPassword(String S){
        HashSet<Character> nums = new HashSet<Character>();
        String[] words = S.split(" ");
        int longestWord = -1;
        int longest = 0;
        boolean flag = true;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
                    nums.add(c);
                }
                else if(Character.isDigit(c))
                {
                    nums.add(c);
                }
                else{
                    nums.add(c);
                    flag = false;
                }
            }
            if (flag == false) {
                longestWord = -1;
                nums.clear();
            }
            else {
                longestWord = Math.max(longestWord,words[i].length());
                if (longestWord>longest) {
                    longest = longestWord;
                    nums.clear();
                }

            }

        }
        System.out.println(longest);

        return  longestWord;

    }
    public static void main(String[] args) {
        UygunStringKontrolüUzun uy = new UygunStringKontrolüUzun();
        System.out.println(uy.LongestPassword("222a a0A55 ?xy15656556"));

    }
}
