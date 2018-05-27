import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p04_Butterflay {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <=n - 2; i++) {
            String starOrDash = " ";
            if (i % 2 == 0) {
                starOrDash = "-";
            } else {
                starOrDash = "*";
            }
            String winds = repeatStr(starOrDash, n - 2);
            System.out.printf("%s\\ /%s%n", winds, winds);
        }
        System.out.println(repeatStr(" ", n - 1) + "@");

        for (int i = 1; i <=n - 2; i++) {
            String starOrDash = " ";
            if (i % 2 == 0) {
                starOrDash = "-";
            } else {
                starOrDash = "*";
            }
            String winds = repeatStr(starOrDash, n - 2);
            System.out.printf("%s/ \\%s%n", winds, winds);
        }
    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
