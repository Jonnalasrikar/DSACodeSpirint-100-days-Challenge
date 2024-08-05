import java.util.Scanner;
class PerfectNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    int n1 = n;
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        sum = sum + i;
        if (i != n / i) {
          sum = sum + n / i;
        }
      }
    }
    System.out.println(sum);
    System.out.println(n1 == sum);
  }
}