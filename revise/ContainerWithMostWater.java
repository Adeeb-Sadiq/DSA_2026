package revise;

public class ContainerWithMostWater {
    static void main() {
        System.out.println(maxArea(new int[]{1, 7, 2, 5, 4, 7, 3, 6}));
        System.out.println(maxArea(new int[]{2,2,2}));
    }
    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int width = heights.length - 1;
        int max = 0;

        while(left < right) {
            if (heights[left] < heights[right]) {
                max = Math.max(max, width * heights[left]);
                left++;
            } else {
                max = Math.max(max, width * heights[right]);
                right--;
            }
            width--;
        }

        return max;
    }
}
