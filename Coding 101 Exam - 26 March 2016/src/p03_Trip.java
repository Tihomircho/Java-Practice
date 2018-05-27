import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p03_Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double buget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();

        String destination = null;
        String place;
        double money = 0;
        if (season.equals("summer")) {
            place = "Camp";
        } else {
            place = "Hotel";
        }
        if (buget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                money = buget * 0.3;
            } else {
                money = buget * 0.7;
            }
        } else if (buget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                money = buget * 0.4;
            } else {
                money = buget * 0.8;
            }
        } else if(buget > 1000) {
            destination = "Europe";
            place = "Hotel";
            money = buget * 0.9;

        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place,money);
    }
}

