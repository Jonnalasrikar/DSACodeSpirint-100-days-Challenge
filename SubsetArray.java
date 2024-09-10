import java.util.*;

class SubsetArray {
  public static void main(String args[]) {
    /**
     * int a[] = { 11, 1, 13, 21, 3, 7 };
     * int b[] = { 11, 3, 7, 1 };
     */
    /*
     * int a[] = { 1, 2, 3, 4, 5, 6 };
     * int b[] = { 1, 2, 4 };
     */
    int a[] = { 10, 5, 2, 23, 19 };
    int b[] = { 19, 5, 3 };
    HashMap<Integer, Boolean> h = new HashMap<>();
    for (int i : a) {
      h.put(i, true);
    }
    boolean ans = true;
    for (int i : b) {
      if (h.containsKey(i) == false) {
        ans = false;
        break;
      }
    }
    System.out.println(ans);
  }
}