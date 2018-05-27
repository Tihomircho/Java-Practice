import java.util.Scanner;

public class p_06PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());

        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        boolean isOnleftSide = (x == x1) && (y >= y1 && y <= y2);
        boolean isOnRightSide = (x == x2) && (y >= y1 && y <= y2);
        boolean isOnTopSide = (y == y1) && (x >= x1 && x <= x2);
        boolean isOnBottomSide = (y == y2) && (x >= x1 && x <= x2);

        if (isOnleftSide||isOnRightSide||isOnTopSide||isOnBottomSide){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}


