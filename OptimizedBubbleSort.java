class OptimizedBubbleSort {

    /**
     * This method sorts the array using Optimized Bubble Sort
     * Optimization: stops early if no swapping happens in a pass
     *
     * @param arr Array of integers to be sorted
     */
    static void bubbleSort(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Boolean flag to check whether any swap occurred in a pass
        boolean swapped;

        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {

            // Assume no swap happened at the beginning of this pass
            swapped = false;

            // Inner loop compares adjacent elements
            // n - 1 - i because the last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {

                // If current element is greater than next element, swap them
                if (arr[j] > arr[j + 1]) {

                    // Swap operation
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Set swapped to true since a swap occurred
                    swapped = true;
                }
            }

            // If no swaps happened in this pass,
            // the array is already sorted, so exit the loop early
            if (!swapped)
                break;
        }
    }

    /**
     * This method prints all elements of the array
     *
     * @param arr Array to be printed
     */
    static void printArray(int[] arr) {

        // Enhanced for-loop to print array elements
        for (int x : arr)
            System.out.print(x + " ");

        // Move to next line after printing
        System.out.println();
    }

    public static void main(String[] args) {

        // Declare and initialize a sorted array
        int[] arr = {1, 2, 3, 4, 5};

        // Call optimized bubble sort method
        bubbleSort(arr);

        // Print the array (already sorted, stops early)
        printArray(arr);
    }
}
