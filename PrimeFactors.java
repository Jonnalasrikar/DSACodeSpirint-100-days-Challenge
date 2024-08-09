import java.util.*;

class PrimeFactors {
  public static boolean isprime(int n) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        count++;
        if (i != n / i) {
          count++;
        }
      }
    }
    return count == 2;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    ArrayList<Integer> primefactors = new ArrayList<>();
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        if (isprime(i)) {
          primefactors.add(i);
        }
        if (i != (n / i) && isprime((n / i))) {
          primefactors.add(n / i);
        }
      }
    }
    System.out.println("The prime factors are" + primefactors);
  }
}