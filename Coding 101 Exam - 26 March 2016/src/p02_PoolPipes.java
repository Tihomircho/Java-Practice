import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by tiho on 6.3.2017 г..
 */
public class p02_PoolPipes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int fullPool = Integer.parseInt(console.nextLine());
        int pipeP1 = Integer.parseInt(console.nextLine());
        int pipeP2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());

        double pipe1Total = pipeP1 * hours;
        double pipe2Total = pipeP2 * hours;
        double total= pipe1Total+pipe2Total;
        DecimalFormat df = new DecimalFormat("#.##");
        if (total <= fullPool) {
            int percentFull = (int) (total / fullPool * 100);
            int pipe1Percent = (int) (pipe1Total / total * 100);
            int pipe2Percent = (int) (pipe2Total / total * 100);
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", percentFull, pipe1Percent, pipe2Percent);
        } else {
            System.out.printf("For %s hours the pool overflows with %s liters.", df.format(hours), df.format(total - fullPool));
        }
    }
}
