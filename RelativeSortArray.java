import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : arr1) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (h.get(arr2[i]) > 0) {
                arr1[index] = arr2[i];
                index++;
                h.put(arr2[i], h.get(arr2[i]) - 1);
            }
        }
        List<Integer> remaining = new ArrayList<>();
        for (int i : h.keySet()) {
            while (h.get(i) > 0) {
                remaining.add(i);
                h.put(i, h.get(i) - 1);
            }
        }
        Collections.sort(remaining);
        for (int i : remaining) {
            arr1[index] = i;
            index++;
        }
        return arr1;
    }

    public static void main(String[] args) {
        // int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        // int arr2[] = { 2, 1, 4, 3, 9, 6 };
        int arr1[] = { 28, 6, 22, 8, 44, 17 };
        int arr2[] = { 22, 28, 8, 6 };
        Solution obj = new Solution();
        int[] result = obj.relativeSortArray(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}