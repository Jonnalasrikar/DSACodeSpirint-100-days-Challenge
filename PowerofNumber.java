import java.util.Scanner;

class PowerofNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    System.out.println("Enter the power=");
    int p = sc.nextInt();
    int pow = 1;
    while (p > 0) {
      if (p % 2 != 0) {
        pow = pow * n;
        p = p - 1;
      } else {
        n = n * n;
        p = p / 2;
      }
    }
    System.out.println(pow);
  }
}