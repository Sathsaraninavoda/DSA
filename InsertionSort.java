class InsertionSort {

    /**
     * This method sorts the array using Insertion Sort algorithm
     *
     * @param arr Array of integers to be sorted
     */
    static void insertionSort(int[] arr) {

        // Get the length of the array
        int n = arr.length;

        // Start from the second element because the first element is already "sorted"
        for (int i = 1; i < n; i++) {

            // Store the current element to be inserted
            int key = arr[i];

            // j points to the index of the previous element
            int j = i - 1;

            // Move elements of the sorted part that are greater than key
            // one position ahead to make space for the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift element to the right
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
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
        int[] arr = {9, 5, 1, 4, 3};

        // Call insertion sort method
        insertionSort(arr);

        // Print the sorted array
        printArray(arr);
    }
}
