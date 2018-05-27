import java.util.Scanner;

public class p_01Numbers1NwithStep3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("n=");
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <=n ; i+=3) {
            System.out.println("The numbers are " + i);
        }
    }
}
