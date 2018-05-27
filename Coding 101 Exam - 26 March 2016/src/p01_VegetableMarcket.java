import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p01_VegetableMarcket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double vegetablePriceKilos = Double.parseDouble(console.nextLine());
        double fruitPriceKilos = Double.parseDouble(console.nextLine());
        int vegetableKilos = Integer.parseInt(console.nextLine());
        int fruitKilos = Integer.parseInt(console.nextLine());

        double result = (vegetablePriceKilos*vegetableKilos)+(fruitPriceKilos*fruitKilos);
        result/=1.94;
        System.out.printf("%f",result);
    }
}
