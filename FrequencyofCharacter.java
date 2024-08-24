import java.util.*;

class FrequencyofCharacter {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string=");
    String a = sc.next();
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    for (int i = 0; i < a.length(); i++) {
      if (hm.containsKey(a.charAt(i))) {
        hm.put(a.charAt(i), hm.get(a.charAt(i)) + 1);
      } else {
        hm.put(a.charAt(i), 1);
      }
    }
    System.out.println(hm);
  }
}