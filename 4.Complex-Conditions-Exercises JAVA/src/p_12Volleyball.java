import java.util.Scanner;

public class p_12Volleyball {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String yearType = console.nextLine().toLowerCase();
        int holidays = Integer.parseInt(console.nextLine());
        int weekendsAtHome = Integer.parseInt(console.nextLine());

        int weekends = 48;

        double activeInSofia = (weekends - weekendsAtHome) * 0.75;
        double activeAtHolidays = (holidays*2.0) / 3;
        double totalPlayedGames = activeInSofia + weekendsAtHome + activeAtHolidays;

        if (yearType.equals("normal")) {
            System.out.println((int)totalPlayedGames);
        }
        else if (yearType.equals("leap")) {
            totalPlayedGames *= 1.15;
            System.out.println((int)totalPlayedGames);
        }

    }
}
