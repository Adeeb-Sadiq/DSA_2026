package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }

    static void main() {
        int[] arr = {1, 4, 2, 9};
        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }
}
