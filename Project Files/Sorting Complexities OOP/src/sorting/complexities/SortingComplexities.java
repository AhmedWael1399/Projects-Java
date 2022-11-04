package sorting.complexities;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortingComplexities {

    public static void main(String[] args) {

        int i;

        String[] SORT_TECHNIQUES = {"Bubble", "Selection", "Insertion", "Heap", "Quick", "Merge"};
        SortFactory sortFactory = new SortFactory();
        System.out.println("*** Sorting Techniques Complexities ***");

        Scanner sc = new Scanner(System.in);
        System.out.print("* Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-n, n + 1);
        }
        System.out.println("* Random array generated.");
        int[] copy = new int[n];
        for (i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        ISort sorter;

        for (String sort_technique : SORT_TECHNIQUES) {
            sorter = sortFactory.getSorter(sort_technique);
            System.out.println("* " + sort_technique + " sorting.....");
            double startTime = System.nanoTime();
            sorter.sort(array);
            double endTime = System.nanoTime();
            double timeElapsed = endTime - startTime;
            System.out.println("* " + sort_technique + " sort execution time in milliseconds: " + timeElapsed / 1000000 + "ms");

            for (i = 0; i < array.length; i++) {
                array[i] = copy[i];
            }
        }

        System.out.println("*** Thanks! ***");
    }
}
