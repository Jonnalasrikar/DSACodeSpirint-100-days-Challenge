import java.util.Arrays;

class SortTheElementsofArray {
  public static void main(String args[]) {
    // int a[] = { 9, 8, 45, 12, 3 };
    int a[]={-1,3,9,7,52,36};
    mergesort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

  public static void mergesort(int a[], int low, int high) {
    if (low == high) {
      return;
    }
    int mid = (low + high) / 2;
    mergesort(a, low, mid);
    mergesort(a, mid + 1, high);
    merge(a, low, mid, high);
  }

  public static void merge(int a[], int low, int mid, int high) {
    int temp[] = new int[high - low + 1];
    int i = 0;
    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (a[left] <= a[right]) {
        temp[i] = a[left];
        i++;
        left++;
      } else {
        temp[i] = a[right];
        i++;
        right++;
      }
    }
    while (left <= mid) {
      temp[i] = a[left];
      i++;
      left++;
    }
    while (right <= high) {
      temp[i] = a[right];
      i++;
      right++;
    }
    for (int j = 0; j < temp.length; j++) {
      a[low + j] = temp[j];
    }
  }
}