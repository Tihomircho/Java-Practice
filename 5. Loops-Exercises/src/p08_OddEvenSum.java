import java.util.Scanner;

public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <=n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;

            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
