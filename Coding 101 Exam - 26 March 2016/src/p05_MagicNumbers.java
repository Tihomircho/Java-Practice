import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p05_MagicNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 100000; i <=999999 ; i++) {
            int currentNuber = i;
            int product=1;
            for (int j = 0; j <6 ; j++) {
                int lastDigit = currentNuber%10;

                product *= lastDigit;
                currentNuber /=10;

            }
            if(product==n){
                System.out.print(i+ " ");
            }
        }
    }
}
