import java.util.Scanner;

class PerfectSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number=");
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 2;
        long end = num / 2;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

}