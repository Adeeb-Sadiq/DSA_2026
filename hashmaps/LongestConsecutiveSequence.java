package hashmaps;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr1 = {100,4,200,1,3,2};
        int[] arr2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr1));
        System.out.println(longestConsecutive(arr2));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);

        int longest = 1;
        for(int n: set) {
            if(set.contains(n - 1)) continue;
            int current = 1;
            while(set.contains(n + 1)) {
                current++;
                n++;
            }
            longest = Math.max(longest, current);
        }

        return longest;
    }
}
