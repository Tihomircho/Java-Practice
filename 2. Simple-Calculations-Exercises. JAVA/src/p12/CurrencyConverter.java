package p12;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double cash = Double.parseDouble(console.nextLine());
        String startingCurancy = console.nextLine().toUpperCase();
        String convertToCurancy = console.nextLine().toUpperCase();
        double cashConverted = CurrencyConverter.CashConverter(cash, startingCurancy, convertToCurancy);

        System.out.printf("%.2f %s", cashConverted, convertToCurancy);
    }

    public static double CashConverter(double cash, String startCurancy, String endCurancy) {

        double toUsd = 1.79549;
        double toEur = 1.95583;
        double toGbp = 2.53405;

        if (cash == 0) {
            return cash;
        } else {
            switch (startCurancy) {
                case "BGN":
                    break;
                case "USD":
                    cash = cash * toUsd;
                    break;
                case "EUR":
                    cash = cash * toEur;
                    break;
                case "GBP":
                    cash = cash * toGbp;
            }

            switch (endCurancy) {
                case "BGN":
                    break;
                case "USD":
                    cash = cash / toUsd;
                    break;
                case "EUR":
                    cash = cash / toEur;
                    break;
                case "GBP":
                    cash = cash / toGbp;
            }

            return cash;
        }
    }
}
