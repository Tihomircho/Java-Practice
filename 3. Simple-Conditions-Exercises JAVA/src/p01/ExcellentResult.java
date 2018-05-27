package p01;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double greade = Double.parseDouble(console.nextLine());
        if (greade >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}