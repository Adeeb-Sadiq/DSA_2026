package revise;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ProductExceptSelf {
    static void main() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
