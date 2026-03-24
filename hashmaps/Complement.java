package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Complement {
    static void main() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = complement(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] complement(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }
}
