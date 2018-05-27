package p11;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine().toLowerCase();
        String word2 = console.nextLine().toLowerCase();

        if (word1.equals(word2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
