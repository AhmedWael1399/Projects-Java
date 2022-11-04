package sorting.complexities;

public class SortFactory {

    public ISort getSorter(String sortType) {
        ISort sorter = null;
        if (sortType.equalsIgnoreCase("Bubble")) {
            return new BubbleSort();
        } else if (sortType.equalsIgnoreCase("Heap")) {
            return new HeapSort();
        } else if (sortType.equalsIgnoreCase("merge")) {
            return new MergeSort();
        } else if (sortType.equalsIgnoreCase("quick")) {
            return new QuickSort();
        } else if (sortType.equalsIgnoreCase("selection")) {
            return new SelectionSort();
        } else if (sortType.equalsIgnoreCase("insertion")) {
            return new InsertionSort();
        } else {

            return null;
        }

    }

}
