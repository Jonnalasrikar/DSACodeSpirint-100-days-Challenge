class LargestElementinArray {
  public static void main(String args[]) {
    int a[] = { 9, 7, 52, 6, 3 };
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("Largest Element in Array is " + max);
  }
}