import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p06_Division {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int divisibleBy2 = 0;
        int divisibleBy3 = 0;
        int divisibleBy4 = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());

            if (currentNumber % 2 == 0) {
                divisibleBy2++;
            }
            if (currentNumber % 3 == 0) {
                divisibleBy3++;
            }
            if (currentNumber % 4 == 0) {
                divisibleBy4++;
            }
        }
        System.out.printf("%.2f%%%n", (double)divisibleBy2 /n *100);
        System.out.printf("%.2f%%%n", (double)divisibleBy3 /n *100);
        System.out.printf("%.2f%%%n", (double)divisibleBy4 /n *100);
    }
}
