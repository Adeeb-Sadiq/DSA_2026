package prefix_sum;

import java.util.HashMap;

public class SubArraySum {
    static void main() {
        int[] nums = {2, 4, 1 ,3, 1};
        int result = subArraySum(nums, 4);
        System.out.println(result);
    }

    private static int subArraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0; int count = 0;

        for(int num: nums) {
            sum += num;
            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
