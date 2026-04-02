package binarysearch;

public class RotatedSortedArray {
    static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int pivot = peakIndex(arr);
        int result = binarySearch(arr, target, 0, pivot);
        if(result == -1) return binarySearch(arr, target, pivot + 1, arr.length -1);
        return result;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == arr[end]) {
                return mid;
            }

            if(arr[mid] < arr[0]) {
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

}
