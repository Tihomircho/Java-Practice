package p08;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double size = Double.parseDouble(console.nextLine());
        String sourceMetric = console.nextLine().toLowerCase();
        String destMetric = console.nextLine().toLowerCase();
       // double size = 0;

        if (size == 0) {
            size = size;
        } else {
            switch (sourceMetric) {
                case "m":
                    break;
                case "mm":
                    size = size / 1000;
                    break;
                case "cm":
                    size = size / 100;
                    break;
                case "mi":
                    size = size / 0.000621371192;
                    break;
                case "in":
                    size = size / 39.3700787;
                    break;
                case "km":
                    size = size / 0.001;
                    break;
                case "ft":
                    size = size / 3.2808399;
                    break;
                case "yd":
                    size = size / 1.0936133;
            }

            switch (destMetric) {
                case "m":
                    size = size;
                    break;
                case "mm":
                    size = size * 1000;
                    break;
                case "cm":
                    size = size * 100;
                    break;
                case "mi":
                    size = size * 0.000621371192;
                    break;
                case "in":
                    size = size * 39.3700787;
                    break;
                case "km":
                    size = size * 0.001;
                    break;
                case "ft":
                    size = size * 3.2808399;
                    break;
                case "yd":
                    size = size * 1.0936133;
            }
        }


        System.out.printf("%f %s", size, destMetric);
    }
}



