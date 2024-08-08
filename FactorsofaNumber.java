import java.util.*;

class FactorsofaNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number=");
    int n = sc.nextInt();
    ArrayList<Integer> factors = new ArrayList<>();
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        factors.add(i);
        if (i != n / i) {
          factors.add(n / i);
        }
      }
    }
    Collections.sort(factors);
    System.out.println("The factors are" + factors);
  }
}