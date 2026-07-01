package revise;

// https://leetcode.com/problems/maximum-average-subarray-i/description/?utm_source=chatgpt.com
public class MaxAvgSubArray {
    static void main() {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }

    // sliding window
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double result;
        double avg;

        // calculating average for first window
        for(int i = 0; i < k; i++) sum += nums[i];
        avg = (double) sum / k;
        result = avg;

        // calculating average of other windows and returning the max;
        for(int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            avg = (double) sum / k;
            result = Math.max(result, avg);
        }

        return result;
    }
}
