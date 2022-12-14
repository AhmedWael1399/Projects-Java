package sorting.complexities;

public class Heap {

    static void maxHeapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp;
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    static void deleteMax(int arr[], int n) {
        int temp;
        temp = arr[0];
        arr[0] = arr[n];
        arr[n] = temp;
        maxHeapify(arr, n, 0);
    }
}
