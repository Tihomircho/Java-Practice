import java.util.Scanner;

public class p_10Diamond {

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

        int leftRight = (n - 1) / 2;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            System.out.print(doMagic("-", leftRight) + "*");

            int midDashes = (n - 2) - (leftRight * 2);
            if (midDashes >= 0) {
                System.out.print(doMagic("-", midDashes) + "*");
            }
            System.out.println(doMagic("-", leftRight));
            leftRight--;
        }  leftRight=1;
        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.print(doMagic("-", leftRight) + "*");

            int midDashes = (n - 2) - (leftRight * 2);
            if (midDashes >= 0) {
                System.out.print(doMagic("-", midDashes) + "*");
            }
            System.out.println(doMagic("-", leftRight));
            leftRight++;
        }
    }
}
