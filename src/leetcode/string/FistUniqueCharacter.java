package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FistUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("jadeja"));
        System.out.println(firstUniqueChar("anna"));

    }

    public static int firstUniqueChar(String s) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            charCount.put(key, charCount.containsKey(key) ? charCount.get(key) + 1 : 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
