package sort_and_search;

import java.util.Arrays;

public class DistanceValueBetweenArrays {
    static void main() {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int result = findTheDistanceValue(arr1, arr2, d);
        System.out.println(result);
    }

    private static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for(int a: arr1) {
            int index = Arrays.binarySearch(arr2, a);
            if(index < 0) {
                index = - index - 1;
            }
            boolean valid = true;

            // check right neighbor
            if(index < arr2.length && Math.abs(arr2[index] - a) <= d) {
                valid = false;
            }
            // check left neighbor
            if(index - 1 >= 0 && Math.abs(arr2[index - 1] - a) <= d) {
                valid = false;
            }

            if(valid) {
                count++;
            }
        }

        return count;
    }
}
