import java.util.Scanner;

public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int currSum = 0;
        int prevSum = 0;
        int diff = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            prevSum = currSum;
            currSum = 0;
            currSum += Integer.parseInt(console.nextLine());
            currSum += Integer.parseInt(console.nextLine());
            if (i != 0) {
                diff = Math.abs(currSum - prevSum);
                if (diff != 0 && diff > maxDiff) {
                    maxDiff = diff;
                }
            }

        }
        if (prevSum == currSum || n == 1) {
            System.out.println("Yes, value=" + currSum);
        } else {
            System.out.println("No, maxdiff= " + maxDiff);
        }
    }
}

