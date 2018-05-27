import java.util.Scanner;

public class p_08TradeComissions {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine().toLowerCase();

        double sales = Double.parseDouble(console.nextLine());
        boolean lowinterval = sales >= 0 && sales <= 500;
        boolean mediuminterval = sales >= 500 && sales <= 1000;
        boolean highinterval = sales > 1000 && sales <= 10000;
        boolean veryHighinterval = sales > 10000;
        double commission = -1;

        if (city.equals("sofia")) {
            if (lowinterval) {
                commission = 0.05;
            } else if (mediuminterval) {
                commission = 0.07;
            } else if (highinterval) {
                commission = 0.08;
            } else if (veryHighinterval) {
                commission = 0.12;
            } else {
                commission = -1;
            }
        } else if (city.equals("varna")) {
            if (lowinterval) {
                commission = 0.045;
            } else if (mediuminterval) {
                commission = 0.075;
            } else if (highinterval) {
                commission = 0.10;
            } else if (veryHighinterval) {
                commission = 0.13;
            } else {
                commission = -1;
            }
        } else if (city.equals("plovdiv")) {
            if (lowinterval) {
                commission = 0.055;
            } else if (mediuminterval) {
                commission = 0.08;
            } else if (highinterval) {
                commission = 0.12;
            } else if (veryHighinterval) {
                commission = 0.145;
            } else {
                commission = -1;
            }
        }
        if (commission != -1) {
            System.out.printf("%.2f", commission * sales);
        } else {
            System.out.println("error");
        }
    }
}


