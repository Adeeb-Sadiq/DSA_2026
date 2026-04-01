package binarysearch;

// leetcode 278: https://leetcode.com/problems/first-bad-version

public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean isBadVersion(int version) {
        return version >= 4; // bad versions is from this version
    }

    static void main() {
        System.out.println(firstBadVersion(10));
    }
}
