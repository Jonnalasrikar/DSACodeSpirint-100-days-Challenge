import java.util.Scanner;

class AlphabetorNot {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character=");
    char a = sc.next().charAt(0);
    if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
      System.out.println("Alphabet");
    } else {
      System.out.println("Not Alphabet");
    }
  }
}