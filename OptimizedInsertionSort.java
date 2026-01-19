// OptimizedInsertionSort.java
// This program demonstrates an optimized version of Insertion Sort

public class OptimizedInsertionSort {

    // Method to perform optimized insertion sort
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {

            int key = arr[i];     // Element to be inserted
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at the correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = { 9, 5, 1, 4, 3 };

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
