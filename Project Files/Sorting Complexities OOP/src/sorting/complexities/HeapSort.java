package sorting.complexities;

public class HeapSort implements ISort {

    Heap heap = new Heap();

    void heapBottomUp(int arr[], int n) {
        int i;
        for (i = (n / 2) - 1; i >= 0; i--) {
            Heap.maxHeapify(arr, n, i);
        }
    }

    @Override
    public void sort(int[] arr) {
        int i;
        int n = arr.length;
        heapBottomUp(arr, n);
        for (i = (n / 2) - 1; i >= 0; i--) {
            Heap.maxHeapify(arr, n, i);
        }
        for (i = n - 1; i > 0; i--) {
            Heap.deleteMax(arr, i);
        }

    }

}
