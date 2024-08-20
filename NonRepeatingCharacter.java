import java.util.*;

class NonRepeatingCharacter {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String s = sc.next();
    HashMap<Character, Integer> h = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (h.containsKey(s.charAt(i))) {
        h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
      } else {
        h.put(s.charAt(i), 1);
      }
    }
    for (char a : h.keySet()) {
      if (h.get(a) == 1) {
        System.out.println(a);
      }
    }
  }
}