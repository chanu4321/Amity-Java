import java.util.Arrays;

public class HeapSort {

    // Function to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            System.out.println("Heap after heapify at index " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("\n--- Sorting Phase ---");

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            System.out.println("Swap root with index " + i + ": " + Arrays.toString(arr));

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
            System.out.println("Heap after heapify with size " + i + ": " + Arrays.toString(arr));
        }
    }

    // To heapify a subtree rooted with node i, n is size of heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;      // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2;// right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heapSort(arr);

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
    }
}
