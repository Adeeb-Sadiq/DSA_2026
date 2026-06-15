package revise;

public class RotatedSortedArraySearch {
    static void main() {
        System.out.println(search(new int[]{3, 4, 5, 6, 1, 2}, 1));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 11));
    }

    public static int search(int[] nums, int target) {
        int pivot = getMin(nums);
        int result = binarySearch(nums, 0, pivot - 1, target);
        if(result == -1) {
            result = binarySearch(nums, pivot, nums.length -1, target);
        }
        return result;
    }

    private static int getMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) start = start + 1;
            else end = mid;
        }
        return start;
    }

    private static int binarySearch(int[] nums, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) start = mid + 1;
            else if(target < nums[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
