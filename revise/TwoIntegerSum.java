package revise;

import java.util.Arrays;

// neetcode - https://neetcode.io/problems/two-integer-sum-ii/question
public class TwoIntegerSum {
    static void main() {
        System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4}, 3)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] {left + 1, right + 1}; // (1-indexed)
            }
        }
        return new int[] {-1, -1};
    }
}
