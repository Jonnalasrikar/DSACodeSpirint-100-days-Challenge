import java.util.*;

class FriendlyPair {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers=");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = Divisorssum(n);
    int b = Divisorssum(m);
    if (a / n == b / m) {
      System.out.println("Friednly Pair");
    } else {
      System.out.println("Not a Friendly Pair");
    }

  }

  public static int Divisorssum(int n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        sum = sum + i;
        if (i != n / i) {
          sum = sum + n / i;
        }
      }
    }
    return sum;
  }
}