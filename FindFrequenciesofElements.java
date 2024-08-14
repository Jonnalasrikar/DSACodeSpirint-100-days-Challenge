import java.util.Collections;
import java.util.HashMap;
import java.util.*;

class FindFrequenciesofElements {
  public static void main(String args[]) {
    // int a[]={1,1,2,6,9,3,1,1,2,3,3,4,5,7,6};
    int a[] = { 2, 3, 4, 99, 1, 2, 8, 6, 44, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    HashMap<Integer, Integer> h = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      if (h.containsKey(a[i])) {
        h.put(a[i], h.get(a[i]) + 1);
      } else {
        h.put(a[i], 1);
      }
    }
    ArrayList<Integer> keys = new ArrayList<>(h.values());
    Collections.sort(keys);
    System.out.println(keys);
    System.out.println(h);
  }
}