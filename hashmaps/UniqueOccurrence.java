package hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrence {
    static void main() {
        System.out.println(uniqueOccurrences(new int[] {2, 2, 1, 3, 2, 3}));
        System.out.println(uniqueOccurrences(new int[] {2, 2, 1, 3, 1, 3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
