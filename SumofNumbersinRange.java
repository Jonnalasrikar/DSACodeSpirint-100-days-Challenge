import java.util.Scanner;

class SumofNumbersinRange {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the start=");
    int start = sc.nextInt();
    System.out.println("Enter the end=");
    int end = sc.nextInt();
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}