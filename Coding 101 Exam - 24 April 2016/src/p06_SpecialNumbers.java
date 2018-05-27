import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p06_SpecialNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.print(" "+i+j+k+l+"");
                        }

                    }

                }

            }

        }

    }
}
