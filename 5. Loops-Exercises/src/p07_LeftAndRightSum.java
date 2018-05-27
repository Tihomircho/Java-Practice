import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            leftSum += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            rightSum += num;
        }
        if (leftSum == rightSum) {
            System.out.println("YES, sum =" + leftSum);
        } else {
            System.out.println("No diff = " + Math.abs(leftSum - rightSum));
        }
    }
}

