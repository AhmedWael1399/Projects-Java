package sorting.complexities;

public class SelectionSort implements ISort {

    @Override
    public void sort(int[] arr) {
        int i, j, min, hold;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            hold = arr[i];
            arr[i] = arr[min];
            arr[min] = hold;
        }

    }

}
