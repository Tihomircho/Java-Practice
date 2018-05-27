import java.util.Scanner;

public class p_09SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num= Integer.parseInt(console.nextLine());

        int sum = 0;
        do {
            int lastDigit= num %10;
            sum+=lastDigit;
            num/=10;
        }while (num>0);
        System.out.println(sum);
    }
}
