import java.util.Scanner;

public class p05InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        boolean Invalid= num >=100 && num <=200|| num==0;
        if(!(Invalid)){
            System.out.println("invalid");
        }
    }
}

