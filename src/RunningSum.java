public class RunningSum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;

            if (i % 2 == 0) {
                System.out.println(i + "\tEven\tRunning Sum: " + sum);
            } else {
                System.out.println(i + "\tOdd\tRunning Sum: " + sum);
            }
        }

        System.out.println("Final Sum of numbers 1 through 100 = " + sum);
    }
}
