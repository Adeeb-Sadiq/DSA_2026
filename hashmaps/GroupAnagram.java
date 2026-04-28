package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String key = new String(str);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    static void main() {
        String[] str = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(str));
    }
}
