import java.util.*;

class AsciiValueofCharacter {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character=");
    char a = sc.next().charAt(0);
    System.out.println((int) a);
  }
}