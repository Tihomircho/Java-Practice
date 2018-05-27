import java.util.Scanner;

public class p_06NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        while (num < 1 || num > 100) {
            System.out.println("Invalid Number");
            num = Integer.parseInt(console.nextLine());
        }
        System.out.println("Your number is " + num);
    }
}
