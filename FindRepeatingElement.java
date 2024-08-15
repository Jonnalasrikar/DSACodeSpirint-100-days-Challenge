import java.util.*;

class FindRepeatingElement {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }
        int t = 0;
        for (int i : h.keySet()) {
            if (h.get(i) > 1) {
                t = i;
                break;
            }
        }
        return t;
    }

    public static void main(String args[]) {
        // int nums[] = { 1, 3, 4, 2, 2 };
        int nums[] = { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(nums));
    }
}