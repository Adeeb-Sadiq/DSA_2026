package twoPointers;

import java.util.Arrays;

public class MergeSortedArrays {
    static void main() {
        int[] num1 = {12, 0, 0, 0, 0, 0};
        int[] num2 = {2, 5, 6, 9, 11};

        merge(num1, 1, num2, 5  );
        System.out.println(Arrays.toString(num1));
    }

    private static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;


        while(i >= 0 && j >=0) {
            if(num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
}
