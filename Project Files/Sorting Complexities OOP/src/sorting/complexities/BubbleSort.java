package sorting.complexities;

public class BubbleSort implements ISort {

    @Override
    public void sort(int[] arr) {
        int pass, f = 0, temp, j;
        int n = arr.length;
        for (pass = 1; pass < n && f == 0; pass++) {
            f = 1;
            for (j = 0; j < n - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    f = 0;
                }
            }
        }
    }

}
