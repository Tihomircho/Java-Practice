package p12;

import java.util.Scanner;


public class SpeedInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double speed = Double.parseDouble(console.nextLine());

        if (speed > 10) {
            if (speed <= 50) {
                System.out.println("average");
            } else if (speed <= 150) {
                System.out.println("fast");
            } else if (speed <= 1000) {
                System.out.println("ultra fast");
            }else if (speed > 1000){
                System.out.println("extremely fast");
            }
        } else {
            System.out.println("slow");
        }

    }
}
