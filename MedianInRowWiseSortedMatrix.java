import java.util.*;
class MedianInRowWiseSortedMatrix {
    public static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = matrix[0][0], high = matrix[n - 1][m - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count <= (n * m) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    private static int countLessEqual(int[] row, int mid) {
        int l = 0, h = row.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (row[m] <= mid) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        // int matrix[][] = {{ 1, 3, 5 },{ 2, 6, 9 },{ 3, 6, 9 }};
        int matrix[][]={{1, 5, 7, 9, 11 },{2, 3, 4, 8, 9 },{4, 11, 14, 19, 20 },{6, 10, 22, 99, 100 },{7, 15, 17, 24, 28}};
        System.out.println("The median is: " + findMedian(matrix));
    }
}
