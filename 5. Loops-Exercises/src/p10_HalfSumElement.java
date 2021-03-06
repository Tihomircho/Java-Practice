import java.io.Console;
import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num > max) {
                max = num;
            }
            sum = sum + num;
        }


        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            int diff = Math.abs(max - sum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
