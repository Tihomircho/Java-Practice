import java.util.Scanner;

/**
 * Created by tiho on 28.2.2017 г..
 */
public class p01_TileRepairment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int playgroundSide= Integer.parseInt(console.nextLine());
        double tileWidth =Double.parseDouble(console.nextLine());
        double tileLength =Double.parseDouble(console.nextLine());

        int banchWidth = Integer.parseInt(console.nextLine());
        int banchlength = Integer.parseInt(console.nextLine());

        int playgroundArea = playgroundSide*playgroundSide;
        int benchArea=banchlength*banchWidth;

        double tileArea = tileWidth*tileLength;
        double tileNeeded = (playgroundArea-benchArea)/tileArea;
        double timeNeeded = tileNeeded* 0.2;
        System.out.println(tileNeeded);
        System.out.println(timeNeeded);

    }
}
