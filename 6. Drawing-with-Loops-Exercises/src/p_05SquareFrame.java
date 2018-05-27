import java.util.Scanner;

public class p_05SquareFrame {
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
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {

            System.out.print(" -");
        }
        System.out.print(" +");
        System.out.println();
        for (int i = 0; i < n - 2; i++) {

            System.out.print("|");
            System.out.print(doMagic(" -",n-2));
            System.out.println(" |");
        }
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {

            System.out.print(" -");
        }
        System.out.print(" +");
    }
}