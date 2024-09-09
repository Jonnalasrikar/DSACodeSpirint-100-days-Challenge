import java.util.*;
class Symmetricpair {
  public static void main(String args[]) {
    int arr[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
    // int arr[][] = { { 6, 5 }, { 1, 3 }, { 3, 1 }, { 9, 6 }, { 5, 6 }, { 1, 9 } };
    HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("(" + first + " " + second + ") ");
      } else {
        mp.put(first, second);
      }
    }
  }
}