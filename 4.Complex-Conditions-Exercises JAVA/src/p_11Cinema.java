import java.util.Scanner;

public class p_11Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String cinema = console.nextLine().toLowerCase();
        int r = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        double price= 0;
        if (cinema.equals("premiere")) {
            price = 12;
        } else if (cinema.equals("normal")) {
            price = 7.50;
        } else if (cinema.equals("discount")) {
            price = 5;
        }
        // double leva = (r * c) * price;
        System.out.printf( "%.2f" , (r * c) * price);
        System.out.print(" leva");
    }
}
