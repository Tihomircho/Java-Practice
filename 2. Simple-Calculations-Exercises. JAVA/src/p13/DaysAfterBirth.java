package p13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DaysAfterBirth {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String bDay = console.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int add_days = 999;
        LocalDate birthDay = LocalDate.parse(bDay, dateFormat).plusDays(add_days);
        System.out.println(dateFormat.format(birthDay));
    }
}
