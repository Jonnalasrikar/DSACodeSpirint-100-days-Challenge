class MaximumProductSubArray {
  public static void main(String args[]) {
    // int a[] = { 2, 3, -2, 4 };
    int a[] = { -1, -1, -3 };
    int maxProduct = a[0];
    int currentMax = a[0];
    int currentMin = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < 0) {
        int temp = currentMax;
        currentMax = currentMin;
        currentMin = temp;
      }
      currentMax = Math.max(a[i], currentMax * a[i]);
      currentMin = Math.min(a[i], currentMin * a[i]);

      maxProduct = Math.max(maxProduct, currentMax);
    }
    System.out.println(maxProduct);
  }
}
