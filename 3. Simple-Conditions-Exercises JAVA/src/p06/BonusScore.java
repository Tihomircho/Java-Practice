package p06;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        double BonusScore = 0;
        if (num <= 100) {
            BonusScore = 5;
        } else if (num > 1000) {
            BonusScore = num * 0.1;
        } else if (num > 100) {
            BonusScore = num * 0.2;
        }
        if (num % 2 == 0) {
            BonusScore += 1;
        } else if (num % 10 == 5) {
            BonusScore += 2;
        }
        System.out.println(BonusScore);
        System.out.println(num + BonusScore);
    }
}
