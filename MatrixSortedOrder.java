import java.util.*;
class MatrixSortedOrder {
    public static List<Integer> sortedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[] { matrix[i][0], i, 0 });
        }
        List<Integer> sortedList = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int value = current[0];
            int row = current[1];
            int col = current[2];
            sortedList.add(value);
            if (col + 1 < m) {
                minHeap.offer(new int[] { matrix[row][col + 1], row, col + 1 });
            }
        }
        return sortedList;
    }
    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        List<Integer> sortedElements = sortedMatrix(matrix);
        System.out.println("Sorted Elements: " + sortedElements);
    }
}
