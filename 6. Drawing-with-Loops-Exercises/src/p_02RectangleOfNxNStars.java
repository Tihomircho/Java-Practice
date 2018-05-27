import java.util.Scanner;

public class p_02RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n =Integer.parseInt(console.nextLine());
        for (int i = 0; i <n; i++) {
            System.out.println(doMagic("*",n));
        }


    }

    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;
        }
        return output;
    }
}
