import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Avant tri : " + Arrays.toString(arr));

        // 🔵 Test Bubble Sort
        Sorting.bubbleSort(arr);
        System.out.println("Après Bubble Sort : " + Arrays.toString(arr));

        // 🟡 Test Selection Sort (nouveau tableau)
        int[] arr2 = {7, 4, 8, 2, 1};
        Sorting.selectionSort(arr2);
        System.out.println("Selection Sort : " + Arrays.toString(arr2));

        // 🟠 Test Insertion Sort
        int[] arr3 = {10, 6, 3, 8, 2};
        Sorting.insertionSort(arr3);
        System.out.println("Insertion Sort : " + Arrays.toString(arr3));

        // 🔍 Recherche
        int index = Searching.linearSearch(arr, 3);
        System.out.println("Linear Search (3) index: " + index);

        int index2 = Searching.binarySearch(arr, 5);
        System.out.println("Binary Search (5) index: " + index2);
    }
}