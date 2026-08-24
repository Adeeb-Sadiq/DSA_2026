package hashmaps;

import java.util.HashMap;


// leetcode : https://leetcode.com/problems/verifying-an-alien-dictionary/
public class VerifyAlienDictionary {
    public static void main(String[] args) {
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = {"hello", "leetcode"};
        System.out.println(isAlienSorted(words, order));
        words = new String[] {"hello", "leetcode", "hi"};
        System.out.println(isAlienSorted(words, order));

        order = "worldabcefghijkmnpqstuvxyz";
        words = new String[] {"word","world","row"};
        System.out.println(isAlienSorted(words, order));

    }

    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                int pos1 = map.get(words[i].charAt(j));
                int pos2= map.get(words[i + 1].charAt(j));
                if(pos1 < pos2) break;
                if(pos2 < pos1) return false;
                if(j == words[i].length() - 1 && j < words[i + 1].length() - 1) break;
                if(j < words[i].length() - 1 && j == words[i + 1].length() - 1) return false;
            }
        }
        return true;
    }
}
