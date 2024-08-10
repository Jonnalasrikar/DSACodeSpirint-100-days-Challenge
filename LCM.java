import java.util.*;

class LCM {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers=");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int lcm = Math.max(a, b);
    while (true) {
      if (lcm % a == 0 && lcm % b == 0) {
        System.out.println(lcm);
        break;
      }
      lcm++;
    }
  }
}