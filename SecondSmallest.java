class SecondSmallest {
  public static void main(String args[]) {
    // int a[] = { 9, 8, 45, 12, 3 };
    int a[] = { 5, 9, 6, 3, 18, 2, 1 };
    int smallest = a[0];
    int secondsmallest = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < smallest) {
        secondsmallest = smallest;
        smallest = a[i];
      }
    }
    System.out.println("Seconf smallest element is " + secondsmallest);
  }
}nd