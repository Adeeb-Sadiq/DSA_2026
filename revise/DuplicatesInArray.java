package revise;

import java.util.HashSet;
import java.util.Set;

// neetcode - https://neetcode.io/problems/duplicate-integer/question;
public class DuplicatesInArray {
    static void main() {
        System.out.println(hasDuplicate(new int[] {1, 2, 3, 3}));
        System.out.println(hasDuplicate(new int[] {1, 2, 3, 4}));
        System.out.println(hasDuplicate(new int[] {10, 9, 7, 7}));
        System.out.println(hasDuplicate(new int[] {10, 9, 8, 7}));
    }

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            if(set.contains(n)) return true;
            else set.add(n);
        }
        return false;
    }
}
