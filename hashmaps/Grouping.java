package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Grouping {
    static void main() {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = grouping(arr);
        System.out.println(result);
    }

    private static List<List<String>> grouping(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: arr) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String key = new String(str);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
