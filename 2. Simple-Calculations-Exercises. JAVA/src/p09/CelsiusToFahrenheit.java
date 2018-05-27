package p09;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Celsius - ");
        double Celsius = Double.parseDouble(console.nextLine());
        double Fahrenheit;
        Fahrenheit = (Celsius * 1.8)+32;
        System.out.printf("%s %.2f", "Fahrenheit - ",Fahrenheit);

    }
}
