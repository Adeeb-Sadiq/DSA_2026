package twopointers;

public class Container_with_most_water {
    static void main() {
        int[] arr = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(arr));
        System.out.println(maxArea(new int[]{2,2,2}));
    }

    public static int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int n = heights.length - 1;
        int area;
        int max = 0;
        while(i < j) {
            if(heights[i] < heights[j]) {
                area = n * heights[i];
                max = Math.max(max, area);
                i++;
            } else {
                area = n * heights[j];
                max = Math.max(max, area);
                j--;
            }
            n--;
        }
        return max;
    }
}
