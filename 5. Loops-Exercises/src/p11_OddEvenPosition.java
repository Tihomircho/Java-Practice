import java.util.Scanner;

public class p11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n = Double.parseDouble(console.nextLine());
        double minSum = Double.MAX_VALUE;
        double maxSum = Double.MIN_VALUE;
        double maxdiff = Double.MIN_VALUE;
        double previousSum = 0;
        for (double i = 1; i < n; i++) {
            double firstNumber = Double.parseDouble(console.nextLine());
            double sec0ndNumber = Double.parseDouble(console.nextLine());
            double sum = firstNumber + sec0ndNumber;
            if (sum < minSum) {
                minSum = sum;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (maxdiff < sum - previousSum) {
                maxdiff = sum - previousSum;

            }
            previousSum = sum;
        }
        if (maxSum == minSum) {
            System.out.println("Yes, value=" + maxSum);
        } else {
            System.out.println("No, maxdiff=" + Math.min(maxSum - minSum, maxdiff));
        }
    }
}

