public class Countdown {
    public static void countdown(int i) {
        System.out.println(Integer.toString(i) + " Iterations left");
        if (i <= 0)
            return;
        countdown(i - 1);
    }

    public static void main(String args[]) {
        System.out.println("Testing countdown:");
        countdown(5);
        countdown(0);
        countdown(3);
    }
}
