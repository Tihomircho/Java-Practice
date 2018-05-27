import java.util.Scanner;

public class p_11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    break;
                }
                System.out.println("Number is not even");

            }catch (NumberFormatException ex){
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Number is even " + n);
    }
}
