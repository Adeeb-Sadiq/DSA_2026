package sort_and_search;

import java.util.Arrays;

public class LongestSubsequence {
    static void main() {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] answer = answerQueries(nums, queries);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int[] res = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            res[i] = upperBound(nums, queries[i]);
        }


        return res;
    }

    private static int upperBound(int[] nums, int query) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2 ;
            if(query >= nums[mid]) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
