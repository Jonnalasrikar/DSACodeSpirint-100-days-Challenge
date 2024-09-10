import java.util.*;

class Disjoint {
  public static void main(String args[]) {
    // int a[] = { 12, 34, 11, 9, 3 };
    // int b[] = { 2, 1, 3, 5 };
    int a[] = { 12, 34, 11, 9, 3 };
    int b[] = { 7, 2, 1, 5 };
    HashMap<Integer, Boolean> h = new HashMap<>();
    for (int i : a) {
      h.put(i, true);
    }
    boolean ans = true;
    for (int i : b) {
      if (h.containsKey(i)) {
        ans = false;
        break;
      }
    }
    System.out.println(ans);
  }
}