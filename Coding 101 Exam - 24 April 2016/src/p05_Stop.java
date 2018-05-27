import java.util.Scanner;

/**
 * Created by tiho on 3.3.2017 г..
 */
public class p05_Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        // System.out.println(repeatStr(".",n+1)+repeatStr("_",n*2+1)+repeatStr(".",n+1));
        System.out.printf("%1$s%2$s%1$s%n", repeatStr(".", n + 1), repeatStr("_", n * 2 + 1 ));
        int underscoreCount = 2 * n - 1;
        for (int i = n; i >= 1; i--) {
            String dots = repeatStr(".", i);
            String underscores = repeatStr("_", underscoreCount);
            System.out.println(dots + "//" + underscores + "\\\\" + dots);
            underscoreCount += 2;
        }
         System.out.println("//"+repeatStr("_",n*2-3)+"STOP!"+repeatStr("_",n*2-3)+"\\\\");
        //System.out.printf("//%1$sSTOP!%1$s\\\\%n", repeatStr("_", n * 2 - 3));

        for (int i = 0; i < n; i++) {
            String dots = repeatStr(".", i);
            String underscores = repeatStr("_", underscoreCount);
            System.out.println(dots + "\\\\" + underscores + "//" + dots);
            underscoreCount -= 2;
        }

    }


    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}