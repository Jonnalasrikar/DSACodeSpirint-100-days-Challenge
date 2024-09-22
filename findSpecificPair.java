class SpecificPairInMatrix {
    public static int findSpecificPair(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxValue = Integer.MIN_VALUE;
        int[][] maxMatrix = new int[n][m];
        maxMatrix[n-1][m-1] = matrix[n-1][m-1];

        for (int i = n - 2; i >= 0; i--) {
            maxMatrix[i][m - 1] = Math.max(matrix[i][m - 1], maxMatrix[i + 1][m - 1]);
        }
        for (int j = m - 2; j >= 0; j--) {
            maxMatrix[n - 1][j] = Math.max(matrix[n - 1][j], maxMatrix[n - 1][j + 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                maxValue = Math.max(maxValue, maxMatrix[i + 1][j + 1] - matrix[i][j]);
                maxMatrix[i][j] = Math.max(matrix[i][j], Math.max(maxMatrix[i + 1][j], maxMatrix[i][j + 1]));
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 6, 1, 3 }, { -4, -1, 1, 7, -6 }, { 0, -4, 10, -5, 1 } };

        int result = findSpecificPair(matrix);
        System.out.println("Maximum Difference Pair: " + result);
    }
}
