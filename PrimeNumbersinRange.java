import java.util.Scanner;

class PrimeNumbersinRange {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting number=");
    int l = sc.nextInt();
    System.out.println("Enter the ending number=");
    int h = sc.nextInt();
    int a[] = new int[h];
    for (int i = 2; i < h; i++) {
      a[i] = 1;
    }
    for (int i = 2; i * i < h; i++) {
      if (a[i] == 1) {
        for (int j = i * i; j < h; j = j + i) {
          a[j] = 0;
        }
      }
    }
    for (int i = l; i < h; i++) {
      if (a[i] == 1) {
        System.out.print(i + " ");
      }
    }

  }

}