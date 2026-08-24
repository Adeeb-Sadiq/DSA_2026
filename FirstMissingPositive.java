public class FirstMissingPositive {

    // leetcode : https://leetcode.com/problems/first-missing-positive/submissions/2118179030/
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {1,2,0}));
        System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
        System.out.println(firstMissingPositive(new int[] {7,8,9,11,12}));
    }

    // Time Complexity O(n), Space Complexity O(1)
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // check one is present
        int one = 0;
        for(int num: nums) {
            if(num == 1) {
                one++;
                break;
            }
        }
        if(one == 0) return 1;

        for(int i = 0; i < n; i++) {
            if (nums[i] < 1 || nums[i] > n) nums[i] = 1;
        }

        for(int i = 0; i < n; i++) {
            int a = Math.abs(nums[i]);
            if(a == n) nums[0]= -Math.abs(nums[0]);
            else nums[a] = -Math.abs(nums[a]);
        }

        for(int i = 1; i < n; i++) {
            if(nums[i] > 0) return i;
        }

        // edge case
        if(nums[0] > 0) return n;

        return n + 1;
    }
}
