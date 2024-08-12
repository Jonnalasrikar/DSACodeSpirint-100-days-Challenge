import java.util.Arrays;

class ReverseArray {
  public static void main(String args[]) {
    char a[] = { 'h', 'e', 'l', 'l', 'o' };
    // char a[] = { 'H', 'a', 'n', 'n', 'a', 'h' };
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      char temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }
    System.out.println(Arrays.toString(a));
  }
}