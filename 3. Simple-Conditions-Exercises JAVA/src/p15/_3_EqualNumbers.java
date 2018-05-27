package p15;

import java.util.Scanner;

public class _3_EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());

        if ((num1 == num2)&&(num2==num3)&&(num3==num1)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
