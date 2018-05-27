import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double OddSum = 0;
        double EvenSum = 0;
        double OddMin = Double.MAX_VALUE;
        double OddMax = Double.MIN_VALUE;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = Double.MIN_VALUE;
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                double NumberEven = Double.parseDouble(console.nextLine());
                EvenSum += NumberEven;

                if (NumberEven < EvenMin) {
                    EvenMin = NumberEven;
                }
                if (NumberEven > EvenMax) {
                    EvenMax = NumberEven;
                }
            } else {
                double NumberOdd = Double.parseDouble(console.nextLine());
                OddSum += NumberOdd;
                if (NumberOdd < OddMin) {
                    OddMin = NumberOdd;
                }
                if (NumberOdd > OddMax) {
                    OddMax = NumberOdd;
                }

            }
        }
        if (n == 0) {
            System.out.printf(" %.0f %n OddSum=", OddSum);
            System.out.printf(" %.0f %n OddMin=No");
            System.out.printf(" %.0f %n OddMax=No");
            System.out.printf(" %.0f %n EvenSum=", EvenSum);
            System.out.printf(" %.0f %n EvenMin=No");
            System.out.printf(" %.0f %n EvenMax=No");
        } else if ((EvenMin == Double.MAX_VALUE) || (EvenMax == Double.MIN_VALUE)) {
            System.out.printf(" %.0f %n OddSum=", OddSum);
            System.out.printf(" %.0f %n OddMin=", OddMin);
            System.out.printf(" %.0f %n OddMax=", OddMax);
            System.out.printf(" %.0f %n EvenSum=", EvenSum);
            System.out.printf(" %.0f %n EvenMin=No");
            System.out.printf(" %.0f %n EvenMax=No");
        } else {
            System.out.printf(" %.0f %n OddSum=", OddSum);
            System.out.printf(" %.0f %n OddMin=", OddMin);
            System.out.printf(" %.0f %n OddMax=", OddMax);
            System.out.printf(" %.0f %n EvenSum=", EvenSum);
            System.out.printf(" %.0f %n EvenMin=", EvenMin);
            System.out.printf(" %.0f %n EvenMax=", EvenMax);
        }

    }
}
