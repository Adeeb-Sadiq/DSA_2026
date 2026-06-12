package revise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    static void main() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = Arrays.toString(c);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
