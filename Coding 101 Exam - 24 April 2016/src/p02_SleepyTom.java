import java.util.Scanner;

/**
 * Created by tiho on 28.2.2017 г..
 */
public class p02_SleepyTom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int holiDays = Integer.parseInt(console.nextLine());
        int workDays = 365 - holiDays;

        int playTime = holiDays * 127 + workDays * 63;
        int differece = Math.abs(30000 - playTime);
        int hours = differece / 60;
        int minutes = differece % 60;

        if (playTime < 30000) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play ", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play ", hours, minutes);
        }

    }
}
