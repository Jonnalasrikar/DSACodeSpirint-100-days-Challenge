import java.util.*;

class AbdundantNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    int sum = 1;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        sum = sum + i;
        if (i != n / i) {
          sum = sum + n / i;
        }
      }
    }
    if (sum > n) {
      System.out.println("Abdundant Number");
    } else {
      System.out.println("Not an Abdundant Number");
    }

  }
}