import java.util.Arrays;
import java.util.*;
class Solution {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(h.keySet());
        Collections.sort(keys, (a, b) -> {
            int freqA = h.get(a);
            int freqB = h.get(b);
            if (freqA != freqB) {
                return freqA - freqB;
            } else {
                return b - a;
            }
        });
        int[] result = new int[nums.length];
        int index = 0;
        for (int key : keys) {
            int frequency = h.get(key);
            for (int i = 0; i < frequency; i++) {
                result[index++] = key;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        // int a[] = { 1, 1, 2, 2, 2, 3 };
        int a[] = { 2, 3, 1, 3, 2 };
        System.out.println(Arrays.toString(frequencySort(a)));
    }

}