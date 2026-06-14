package revise;

public class BinarySearch {
    static void main() {
        System.out.println(search(new int[] {-1,0,2,4,6,8}, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) start = mid + 1;
            else if(target < nums[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
