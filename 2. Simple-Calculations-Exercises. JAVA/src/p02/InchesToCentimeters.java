package p02;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("inches = ");
        double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters);

    }
}
