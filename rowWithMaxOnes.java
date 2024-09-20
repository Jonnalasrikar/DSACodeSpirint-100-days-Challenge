class RowWithMaxOnes {
    public static int rowWithMaxOnes(int[][] matrix) {
        int maxRowIndex = -1;
        int maxCount = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int count = countOnes(matrix[i], m);
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;}
    private static int countOnes(int[] row, int m) {
        int l = 0, h = m - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (row[mid] == 1) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return m - l;}
    public static void main(String[] args) {
        int matrix[][] = {{ 0, 0, 0, 1 },{ 0, 1, 1, 1 },{ 1, 1, 1, 1 },{ 0, 0, 0, 0 }};
        int result = rowWithMaxOnes(matrix);
        System.out.println("The row with the maximum number of 1's is: " + result);
    }
}
