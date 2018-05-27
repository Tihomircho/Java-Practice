import java.util.Scanner;

public class p_06RhombusOfStars {
    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int spaces = n - 1;
        int stars = 1;
         for (int i = 0; i < n; i++) {
             System.out.println(doMagic(" ", spaces) + doMagic("* ", stars));
             spaces--;
           stars++;
        }
        spaces = 0 ;
        stars -= 2;
        for (int j = 0; j < n; j++) {
            System.out.println(doMagic(" ", spaces) + doMagic(" *", stars));
            spaces++;
            stars--;
        }
    }
}
