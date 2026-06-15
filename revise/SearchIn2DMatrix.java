package revise;

public class SearchIn2DMatrix {
    static void main() {
        int[][] mat = {{1,2,4,8}, {10,11,12,13}, {14,20,30,40}};
        System.out.println(searchMatrix(mat, 10));
        System.out.println(searchMatrix(mat, 33));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j > -1) {
            int mid = matrix[i][j];
            if(target > mid) i++;
            else if (target < mid) j--;
            else return true;
        }
        return false;
    }
}
