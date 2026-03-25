package slidingwindow;

public class MaxAvgSubArray {
    static void main() {
        int[] nums = new int[] {1,12,-5,-6,50,3};
        System.out.println(findMaxAvg(nums, 4));
    }
    public static double findMaxAvg(int[] arr, int k) {
        int n = arr.length;
        double result;

        // avg of first window
        int sum = 0;
        double avg;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        avg = (double) sum / k;
        result = avg;

        // sliding window
        for(int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i-k];
            avg = (double) sum / k;
            result = Math.max(result, avg);
        }

        return result;
    }
}
