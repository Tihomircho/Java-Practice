import java.util.Scanner;

/**
 * Created by tiho on 13.3.2017 г..
 */
public class demo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i =0 ; i <=n ; i+=2) {
            System.out.println(i);
            num = 2*2;

        }
    }
}
