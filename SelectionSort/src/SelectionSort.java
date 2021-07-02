public class SelectionSort {
    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index])
                    min_index = j;
            }
            int tmp = array[min_index];
            array[min_index] = array[i];
            array[i] = tmp;
        }
    }

    public static void print_array(int array[]) {
        for (int num : array)
            System.out.print(num + " ");
    }

    public static void main(String args[]) {
        int test_array[] = {4, 7, -5, 10, 100, 50, 64};
        SelectionSort.sort(test_array);
        SelectionSort.print_array(test_array);
    }
}
