package sorting.complexities;

import java.util.Arrays;

public class MergeSort implements ISort {

    void merge(int c[], int l, int m, int r) {

        int i, j, k;
        int a[] = Arrays.copyOfRange(c, l, m + 1);
        int b[] = Arrays.copyOfRange(c, m + 1, r + 1);
        int n1 = a.length;
        int n2 = b.length;
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < n2) {
            c[k] = b[j];
            j++;
            k++;
        }

    }

    @Override
    public void sort(int arr[]) {
        merge_sort(arr, 0, arr.length - 1);
    }

    public void merge_sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid + 1, r);

            merge(arr, l, mid, r);

        }

    }

}
