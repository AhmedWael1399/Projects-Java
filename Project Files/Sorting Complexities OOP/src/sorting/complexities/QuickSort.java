package sorting.complexities;

public class QuickSort implements ISort {

    int partition(int arr[], int lowIndex, int highIndex) {
        int pivot = arr[highIndex];
        int i = (lowIndex - 1), j;

        for (j = lowIndex; j <= highIndex - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1;
        temp1 = arr[i + 1];
        arr[i + 1] = arr[highIndex];
        arr[highIndex] = temp1;
        return (i + 1);
    }

    void quickSort(int arr[], int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivot = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivot - 1);
            quickSort(arr, pivot + 1, highIndex);
        }
    }

    @Override
    public void sort(int[] arr) {
        this.quickSort(arr, 0, arr.length - 1);
    }

}
