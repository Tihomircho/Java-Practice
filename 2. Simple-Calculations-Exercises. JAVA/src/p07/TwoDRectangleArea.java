package p07;

import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double a = Math.abs(x1-y1);
        double b = Math.abs(x2-y2);

        double area = a*b;
        double perimeter = 2*(a+b);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
