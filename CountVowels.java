import java.util.*;

class CountVowels {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String a = sc.nextLine();
    a = a.toLowerCase();
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
        count++;
      }
    }
    System.out.println("Number of vowels in the string=" + count);

  }
}