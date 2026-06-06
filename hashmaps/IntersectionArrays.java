package hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {
    static void main() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2};
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] result1 = intersection(nums1, nums2);
        int[] result2 = intersection(nums3, nums4);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int n: nums1) {
            set.add(n);
        }
        for(int n: nums2) {
            if(set.contains(n)) result.add(n);
        }
        int[] arr = new int[result.size()];
        int i = 0;
        for(int n: result) {
            arr[i++] = n;
        }
        return arr;
    }
}
