package p01;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("a= ");
        int a= Integer.parseInt(console.nextLine());
        int area = a*a;
        System.out.println("Square = "+ area);
    }
}
