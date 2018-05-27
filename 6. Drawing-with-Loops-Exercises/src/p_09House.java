import java.util.Scanner;

public class p_09House {
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

        int dashes = n / 2;
        int stars = 1;
        if(n%2==0){
            dashes--;
            stars++;

        }
        for (int i = 0; i < (n + 1) / 2; i++) {
            System.out.println(doMagic("-", dashes) + doMagic("*", stars) + doMagic("-", dashes));
            dashes--;
            stars+=2;

        }
        for (int i = 0; i <n/2 ; i++) {
            System.out.println("|"+doMagic("*",n-2)+"|");

        }
    }
}
