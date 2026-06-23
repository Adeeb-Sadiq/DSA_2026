package revise;

import java.util.ArrayList;
import java.util.List;

public class SubsetsNumbers {
    static void main() {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backTrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for(int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backTrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
