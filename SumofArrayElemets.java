class SumofArrayElemets {
  public static void main(String args[]) {
    // int a[] = {1,2,3,4,5};
    int a[] = { 9, 8, 45, 12, 3 };
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println(sum);
  }
}