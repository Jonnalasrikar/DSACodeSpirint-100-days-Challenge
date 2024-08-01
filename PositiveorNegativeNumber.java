import java.util.Scanner;

class PositiveorNegativeNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    double num = sc.nextDouble();
    if (num >= 0) {
      System.out.println("Positive Number");
    } else {
      System.out.println("Negatve Number");
    }

  }
}