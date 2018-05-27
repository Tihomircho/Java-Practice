import java.util.Scanner;

public class p_08Sunglasses {
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


        System.out.println(doMagic("*", n * 2) + doMagic(" ", n) + doMagic("*", n * 2));

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*" + doMagic("/", 2 * n - 2) + "*");
            if(i !=(n-1)/2-1){
                System.out.print(doMagic(" ",n));
            }else{
                System.out.print(doMagic("|",n));
            }
            System.out.print("*" + doMagic("/", 2 * n - 2) + "*");
            System.out.println();
        }

        System.out.println(doMagic("*", n * 2) + doMagic(" ", n) + doMagic("*", n * 2));

    }
}
