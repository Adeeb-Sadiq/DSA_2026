package twopointers;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else return new int[] {left, right};
        }

        return new int[] {-1, -1};
    }

    static void main() {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }
}
