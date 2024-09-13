import java.util.*;
class Solution {
    public static int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> h = new TreeMap<>();
        for (int i : arr) {
            h.put(i, 0);
        }
        int rank = 1;
        for (int key : h.keySet()) {
            h.put(key, rank);
            rank++;
        }
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = h.get(arr[i]);
        }
        return result;
    }
    public static void main(String args[]) {
        int arr[] = { 40, 10, 20, 30 };
        // int arr[] = { 100, 100, 100 };
        int result[] = arrayRankTransform(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}