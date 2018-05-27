import java.util.Scanner;

public class p_08Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int fact = 1;
        do {
            fact *=n;
            n--;
        }while (n>1);
        System.out.println(fact);

    }
}
