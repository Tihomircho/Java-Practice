import java.util.Scanner;

/**
 * Created by tiho on 1.3.2017 г..
 */
public class P03_OperationDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N1 = Integer.parseInt(console.nextLine());
        int N2 = Integer.parseInt(console.nextLine());
        String operation = console.nextLine();

        if (operation.equals("+")) {
            int result = N1 + N2;
            String oddorEven = result % 2 == 0 ? "even" : "odd";
            System.out.printf("%d + %d = %d - %s", N1, N2, result, oddorEven);
        } else if (operation.equals("-")) {
            int result = N1 - N2;
            String oddorEven = result % 2 == 0 ? "even" : "odd";
            System.out.printf("%d - %d = %d - %s", N1, N2, result, oddorEven);
        } else if (operation.equals("*")) {
            int result = N1 * N2;
            String oddorEven = result % 2 == 0 ? "even" : "odd";
            System.out.printf("%d * %d = %d - %s", N1, N2, result, oddorEven);
        } else if (operation.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double result = (double)N1 / N2;
                System.out.printf("%d / %d = %.2f", N1, N2, result);
            }

        } else if (operation.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
        }else {
                int result = N1%N2;
                System.out.printf("%d %% %d = %d ", N1,N2,result);
            }
        }
    }
}