package p11;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Лева - ");
        double bgn = Double.parseDouble(console.nextLine());
        double usd = bgn*1.79549;
        System.out.printf("Долара - " + "%.2f",usd);
        System.out.print("$");
    }
}
