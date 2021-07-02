public class BinarySearch {
    public static Integer search(int value, int array[]) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (high + low) / 2;
            int guess = array[middle];
            if (guess == value)
                return middle;
            if (value > guess)
                low = middle + 1;
            else
                high = middle - 1;
        }
        return null;
    }
    public static void main(String args[]){
        System.out.println("Tests:");
        int test1[] = {1, 2, 3, 4};
        System.out.println(BinarySearch.search(1, test1) != null);
        int test2[] = {120, 160, 300, 800};
        System.out.println(BinarySearch.search(500, test2) != null);
        int test3[] = {15, 20, 30, 34};
        System.out.println(BinarySearch.search(34, test3) != null);
        int test4[] = {1, 2, 3, 4, 8};
        System.out.println(BinarySearch.search(3, test4) != null);
    }
}
