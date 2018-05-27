import java.util.Scanner;

/**
 * Created by tiho on 3.3.2017 г..
 */
public class p04_SmartLily {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int birthdays = Integer.parseInt(console.nextLine());
        double woshinMashineprice = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());

        double totalSavings = 0;
        int bonus = 10;

        for (int i = 1; i <= birthdays; i++) {
            if (i % 2 == 0) {
                totalSavings += bonus;
                totalSavings -= 1;
                bonus += 10;

            } else {
                totalSavings += toyPrice;
            }
        }
        if (totalSavings >= woshinMashineprice) {
            System.out.printf("Yes! %.2f", totalSavings - woshinMashineprice);

        } else {
            System.out.printf("No! %.2f", woshinMashineprice - totalSavings);
        }
    }
}

