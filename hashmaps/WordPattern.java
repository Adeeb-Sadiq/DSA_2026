package hashmaps;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    static void main() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
        pattern = "abba";
        s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
        pattern = "abbaa";
        s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] ch = pattern.toCharArray();

        if(ch.length != words.length) return false;

        HashMap<Character, String> cs = new HashMap<>();
        HashMap<String, Character> sc = new HashMap<>();
        for(int i = 0; i < ch.length; i++) {
            if(cs.containsKey(ch[i])) {
                if(!Objects.equals(cs.get(ch[i]), words[i])) return false;
            } else {
                cs.put(ch[i], words[i]);
            }
            if(sc.containsKey(words[i])) {
                if(!Objects.equals(sc.get(words[i]), ch[i])) return false;
            } else {
                sc.put(words[i], ch[i]);
            }
        }

        return true;
    }
}
