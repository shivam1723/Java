public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;  // i starts from low - 1

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);  // Place the pivot in the correct position
        return i + 1;
    }

    public static void QS(int[] arr, int low, int high) {
        if (low < high) {
            int partition = Partition(arr, low, high);
            QS(arr, low, partition - 1);
            QS(arr, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        // Quick Sort
        int[] arr = {5, 2, 7, 9, 3, 4, 6};

        QS(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
