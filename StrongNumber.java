import java.util.Scanner;

class StrongNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    int n1 = n;
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      sum = sum + factorial(rem);
      n = n / 10;
    }
    System.out.println(sum == n1);
  }

  public static int factorial(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }
}