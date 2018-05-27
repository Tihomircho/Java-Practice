import java.util.Scanner;

public class p_4TriangleOfDollars {
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
        for (int i = 1; i <= n; i++) {
            System.out.println(doMagic(" ", n-1).trim()+doMagic(" $",i).trim());


        }

    }
}