package binarysearch;

public class Min_in_rotatedArray {

    static void main() {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
        System.out.println(findMin(new int[]{4,5,0,1,2,3}));
    }

    public static int findMin(int[] nums) {
        int start = 0 ;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
