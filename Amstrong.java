import java.util.*;

class Amstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    int n1 = n;
    String a = Integer.toString(n);
    int len = a.length();
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      sum = sum + (int) Math.pow(rem, len);
      n = n / 10;
    }
    System.out.println(sum == n1);

  }
}