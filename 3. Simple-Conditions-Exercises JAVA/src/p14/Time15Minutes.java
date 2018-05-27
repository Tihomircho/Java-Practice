package p14;


import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        int timePlusMinutes = (hours * 60) + minutes + 15;

        hours = timePlusMinutes / 60;

        if (hours >= 24) {
            hours = hours % 24;
        }
        minutes = timePlusMinutes % 60;

        System.out.printf("%d:%02d", hours, minutes);
    }
}

