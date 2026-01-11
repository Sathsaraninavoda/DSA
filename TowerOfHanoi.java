class TowerOfHanoi {

    /**
     * Recursive method to solve Tower of Hanoi problem
     *
     * @param n    Number of disks to move
     * @param from Source rod (where disks start)
     * @param to   Destination rod (where disks should go)
     * @param aux  Auxiliary rod (helper rod)
     */
    static void hanoi(int n, char from, char to, char aux) {

        // Base Case:
        // If there is only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return; // stop recursion
        }

        // Step 1:
        // Move (n-1) disks from source rod to auxiliary rod
        // Destination rod is used as a helper
        hanoi(n - 1, from, aux, to);

        // Step 2:
        // Move the largest disk (nth disk) from source rod to destination rod
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Step 3:
        // Move the (n-1) disks from auxiliary rod to destination rod
        // Source rod is used as a helper
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {

        // Number of disks
        int n = 3;

        // Call the recursive method
        // A = Source rod
        // C = Destination rod
        // B = Auxiliary rod
        hanoi(n, 'A', 'C', 'B');
    }
}
