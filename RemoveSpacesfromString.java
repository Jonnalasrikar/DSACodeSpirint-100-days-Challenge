import java.util.*;

class RemoveSpacesfromString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String a = sc.nextLine();
    String b = "";
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != ' ') {
        b = b + a.charAt(i);
      }
    }
    System.out.println(b);
  }
}