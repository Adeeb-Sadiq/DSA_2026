package twopointers;

import java.util.Arrays;

public class sortedSquares {
    static void main() {
        int[] arr = new int[] {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squares(arr)));
        System.out.println(Arrays.toString(squares(new int[] {-7,-3,2,3,11})));
    }

    public static int[] squares(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}
