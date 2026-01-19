// QuickSort.java
// This program demonstrates the Quick Sort algorithm

public class QuickSort {

    // Method to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;

        // Rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = { 10, 7, 8, 9, 1, 5 };

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
