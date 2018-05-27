package p07;


import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sec1 = Integer.parseInt(console.nextLine());
        int sec2 = Integer.parseInt(console.nextLine());
        int sec3 = Integer.parseInt(console.nextLine());

        int totalSec= sec1+sec2+sec3;

        int minutes = totalSec/60;
        int seconds = totalSec %60;

        System.out.printf("%d:%02d" , minutes,seconds);
    }
}
