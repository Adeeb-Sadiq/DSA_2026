package prefix_sum;

import java.util.Arrays;

public class RunningSum {
    static void main() {
        int[] nums = {3,1,2,10,1};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];

        for(int i = 1; i < n; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
