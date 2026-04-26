package hashmaps;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int num: nums) {
            if(seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }

        return false;
    }

    static void main() {
        int[] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
    }
}


