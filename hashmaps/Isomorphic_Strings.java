package hashmaps;

import java.util.HashMap;

public class Isomorphic_Strings {
    static void main() {
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(t.charAt(i) != map.get(s.charAt(i))) return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                if(s.charAt(i) != map.get(t.charAt(i))) return false;
            } else {
                map.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
