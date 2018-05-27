import java.util.Scanner;

public class p_10CheckPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        boolean isPrime = true;
        if (n<2){
            isPrime=false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("Prime");

        } else {
            System.out.println("Not Prime");
        }
    }
}
