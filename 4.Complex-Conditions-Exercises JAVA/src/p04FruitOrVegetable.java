import java.util.Scanner;

public class p04FruitOrVegetable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();

        if (input.equals("banana") || input.equals("apple") || input.equals("kiwi") || input.equals("cherry")|| input.equals("lemon")||input.equals("grapes")){
            System.out.println("fruit");
        }else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper") || input.equals("carrot")){
            System.out.printf("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}