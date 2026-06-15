package revise;

// neetcode - https://neetcode.io/problems/find-minimum-in-rotated-sorted-array/question
public class MinimumInSorted {
    static void main() {
        System.out.println(findMin(new int[] {3,4,5,6,1,2}));
        System.out.println(findMin(new int[] {4,5,0,1,2,3}));
    }

    public static String findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        return nums[start] + " at index " + start;
    }
}
