package p10;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Radians - ");
        double rad = Double.parseDouble(console.nextLine());
        double deg = rad*180/Math.PI;
        System.out.print("Degrees - ");
        System.out.println(Math.round(deg));
    }
}
