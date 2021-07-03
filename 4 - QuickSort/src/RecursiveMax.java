public class RecursiveMax {
    public static Integer recMax(int array[], int n) {
        if (n == 0)
            return array[0];
        return Math.max(array[n - 1], recMax(array, n - 1));
    }

    public static void main(String args[]) {
        System.out.println(recMax(new int[]{1, 5, 20, -5, 2}, 5) == 20);
    }
}
