import java.util.Scanner;
import java.util.*;

class SumofAllNumbersinString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String a = sc.nextLine();
    int sum = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
        sum = sum + Integer.parseInt(String.valueOf(a.charAt(i)));
      }
    }
    System.out.println(sum);
  }
}