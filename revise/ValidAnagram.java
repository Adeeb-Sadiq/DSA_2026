package revise;

import java.util.HashMap;

// neetcode - https://neetcode.io/problems/is-anagram/question

public class ValidAnagram {
    static void main() {
        System.out.println(isAnagram("racecar", "carrace"));
        System.out.println(isAnagram("jam", "jar"));
        System.out.println(isAnagram("racecar", "carracing"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c: t.toCharArray()) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) map.remove(c);
        }
        return map.isEmpty();
    }
}
