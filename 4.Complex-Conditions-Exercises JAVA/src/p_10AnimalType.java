import java.util.Scanner;

public class p_10AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String animal = console.nextLine().toLowerCase();

        switch (animal){
            case "dog" :
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
