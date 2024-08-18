import java.util.Arrays;
import java.util.Scanner;

class CapitalizetheFirstandLastCharacterofEachWordofaString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String a = sc.nextLine();
    String b[] = a.split(" ");
    String output = "";
    for (int i = 0; i < b.length; i++) {
      output = output + Character.toUpperCase(b[i].charAt(0)) + b[i].substring(1, b[i].length() - 1)
          + Character.toUpperCase(b[i].charAt(b[i].length() - 1));
      if (i != b.length - 1) {
        output = output + " ";
      }
    }
    System.out.println(output);
  }
}