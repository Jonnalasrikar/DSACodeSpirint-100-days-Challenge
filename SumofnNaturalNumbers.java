import java.util.Scanner;

class SumofnNaturalNumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total natural number=");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int val = sc.nextInt();
      sum = sum + val;
    }
    System.out.println(sum);
  }
}