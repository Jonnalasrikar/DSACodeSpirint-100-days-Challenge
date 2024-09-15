class SearchInMatrix {
  public static void main(String args[]) {
    /*
     * int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
     * int target = 3;
     */
    int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    int target = 13;
    System.out.println(searchMatrix(matrix, target));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] <= target && target <= matrix[i][matrix[0].length - 1]) {
        return bs(matrix[i], target);
      }
    }
    return false;
  }

  public static boolean bs(int a[], int target) {
    int l = 0;
    int h = a.length - 1;
    while (l <= h) {
      int m = (l + h) / 2;
      if (a[m] == target) {
        return true;
      } else if (a[m] < target) {
        l = m + 1;
      } else {
        h = m - 1;
      }
    }
    return false;
  }
}