import java.util.Arrays;

public class RecursiveSum {
    public static Integer sum(int array[]){
        if (array.length == 0)
            return 0;
        int element = array[0];
        return element + sum(Arrays.copyOfRange(array, 1, array.length));
    }

    public static void main(String args[]) {
        System.out.println("Testing recursive sum");
        System.out.println(sum(new int[]{1, 2, 3}) == 6);
        System.out.println(sum(new int[]{-5, 20, 31}) == 46);
        System.out.println(sum(new int[]{1}) == 1);
        System.out.println(sum(new int[]{1, 2, 3, 5, 9, -20}) == 0);
    }
}