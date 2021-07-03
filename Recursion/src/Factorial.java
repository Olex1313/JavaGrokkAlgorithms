public class Factorial {
    public static Integer count(int i) {
        if (i == 1 || i == 0)
            return 1;
        else
            return i * count(i - 1);
    }

    public static void main(String args[]) {
        System.out.println("Factorial(0) == 1 ? : " + Boolean.toString(Factorial.count(0) == 1));
        System.out.println("Factorial(3) == 6 ? : " + Boolean.toString(Factorial.count(3) == 6));
        System.out.println("Factorial(5) == 120 ? : " + Boolean.toString(Factorial.count(5) == 120));
        System.out.println("Factorial(6) == 720 ? : " + Boolean.toString(Factorial.count(6) == 720));
    }
}
