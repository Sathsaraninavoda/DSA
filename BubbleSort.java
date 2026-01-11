class BubbleSort {

    /**
     * This method sorts the array using Bubble Sort algorithm
     *
     * @param arr Array of integers to be sorted
     */
    static void bubbleSort(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Outer loop controls the number of passes
        // After each pass, the largest element moves to the end
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            // n - 1 - i because last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {

                // If current element is greater than next element, swap them
                if (arr[j] > arr[j + 1]) {

                    // Temporary variable to store current element
                    int temp = arr[j];

                    // Swap operation
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        // Declare and initialize the array
        int[] arr = {5, 3, 8, 4, 2};

        // Call bubble sort method to sort the array
        bubbleSort(arr);

        // Print the sorted array
        printArray(arr);
    }
}
