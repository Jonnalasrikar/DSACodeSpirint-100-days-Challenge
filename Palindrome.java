import java.util.Scanner;

class Palindrome {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number=");
    int n = sc.nextInt();
    System.out.println(isPalindrome(n));
  }

  public static boolean isPalindrome(int n) {
    int a = n;
    int rev = 0;
    while (n > 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    return a == rev;
  }
}