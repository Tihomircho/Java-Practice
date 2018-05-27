package p03;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}

