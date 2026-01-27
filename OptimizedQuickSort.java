// OptimizedQuickSort.java
// Optimized Quick Sort using Median-of-Three and Insertion Sort

public class OptimizedQuickSort {

    // Threshold to switch to insertion sort
    private static final int CUTOFF = 10;

    // Main quick sort method
    public static void quickSort(int[] arr, int low, int high) {

        // If subarray size is small, use insertion sort
        if (low + CUTOFF > high) {
            insertionSort(arr, low, high);
        } else {
            // Median-of-three pivot selection
            int pivot = medianOfThree(arr, low, high);

            int i = low;
            int j = high - 1;

            // Partitioning
            while (true) {
                while (arr[++i] < pivot) ;
                while (arr[--j] > pivot) ;

                if (i < j)
                    swap(arr, i, j);
                else
                    break;
            }

            // Restore pivot
            swap(arr, i, high - 1);

            // Recursive calls
            quickSort(arr, low, i - 1);
            quickSort(arr, i + 1, high);
        }
    }

    // Median-of-three method
    private static int medianOfThree(int[] arr, int low, int high) {

        int mid = (low + high) / 2;

        if (arr[low] > arr[mid])
            swap(arr, low, mid);
        if (arr[low] > arr[high])
            swap(arr, low, high);
        if (arr[mid] > arr[high])
            swap(arr, mid, high);

        // Place pivot at high-1
        swap(arr, mid, high - 1);
        return arr[high - 1];
    }

    // Insertion sort for small subarrays
    private static void insertionSort(int[] arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int temp = arr[i];
            int j = i;
            while (j > low && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    // Swap utility
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Print array
    private static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 25, 15, 30, 10, 20, 5, 35 };

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
