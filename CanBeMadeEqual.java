import java.util.Scanner;
class CanBeMadeEqual {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);}
    public static boolean canBeEqual(int[] arr) {
        int n = arr.length;
        if (n == 0) return false; 
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);}
        return result > 1;  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;}
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        boolean ans = canBeEqual(arr);
        if (ans) {
            System.out.println("Yes, the numbers can be made equal.");
        } else {
            System.out.println("No, the numbers cannot be made equal.");
        }
    }
}
