public class QuickSort {
    public static void quickSort(int array[]) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int array[], int start, int end) {
        if (start < end + 1) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static Integer partition(int array[], int start, int end) {
        int pivot = array[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++){
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex += 1;
            }
        }
        swap(array, partitionIndex, end);
        return partitionIndex;
    }

    private static void swap(int array[], int first, int second){
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    public static void main(String args[]) {
        int array[] = {1, 7, 4, 6, 12, 2, 0};
        quickSort(array);
        for (int num : array)
            System.out.print(num + " ");
    }
}
