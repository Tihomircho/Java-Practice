import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p07_SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            if (isSpecialNumber(i, n)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isSpecialNumber(int currentNumber, int n) {
        while (currentNumber != 0) {
            int lastDigit = currentNumber % 10;
            if (lastDigit == 0 || n % lastDigit != 0) {
                return false;
            }
            currentNumber /= 10;
        }
    return true ;
    }
}
