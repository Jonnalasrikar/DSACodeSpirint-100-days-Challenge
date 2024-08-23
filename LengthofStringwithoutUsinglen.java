import java.util.Scanner;

class LengthofStringwithoutUsinglen {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String s = sc.nextLine();
    char a[] = s.toCharArray();
    int count = 0;
    for (char b : a) {
      count++;
    }
    System.out.println(count);

  }
}