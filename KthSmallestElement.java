import java.util.*;
class KthSmallestElement {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[] { matrix[i][0], i, 0 });
        }
        int count = 0, result = 0;
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            result = current[0];
            count++;
            if (count == k) {
                return result;
            }
            int row = current[1];
            int col = current[2];
            if (col + 1 < n) {
                minHeap.offer(new int[] { matrix[row][col + 1], row, col + 1 });
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 5, 9 },
            { 10, 11, 13 },
            { 12, 13, 15 }
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}
