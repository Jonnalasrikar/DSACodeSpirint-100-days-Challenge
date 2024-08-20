import java.util.*;
class Anagram {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the strings=");
    String s = sc.next();
    String t = sc.next();
    int l = 1;
    HashMap<Character, Integer> h1 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (h1.containsKey(s.charAt(i))) {
        h1.put(s.charAt(i), h1.get(s.charAt(i)) + 1);
      } else {
        h1.put(s.charAt(i), 1);
      }
    }
    for (int i = 0; i < t.length(); i++) {
      if (h1.containsKey(t.charAt(i))) {
        h1.put(t.charAt(i), h1.get(t.charAt(i)) - 1);
        if (h1.get(t.charAt(i)) == 0) {
          h1.remove(t.charAt(i));
        }
      } else {
        l = 0;
        break;
      }
    }
    if (l == 1) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}