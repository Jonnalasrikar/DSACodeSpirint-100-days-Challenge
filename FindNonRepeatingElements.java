class FindNonRepeatingElements {
    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int e : nums) {
            n = n ^ e;
        }
        return n;
    }

    public static void main(String args[]) {
        // int nums[] = { 2, 2, 1 };
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }
}