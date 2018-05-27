package p13;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String figure = console.nextLine().toLowerCase();
        double area = 0;

        switch (figure){
            case "square":
                double square = Double.parseDouble(console.nextLine());
                area = square * square;
                break;
            case "rectangle":
                double rectangleA = Double.parseDouble(console.nextLine());
                double rectangleB = Double.parseDouble(console.nextLine());
                area = rectangleA * rectangleB;
                break;
            case "circle":
                double rad = Double.parseDouble(console.nextLine());
                area = rad * rad * Math.PI;
                break;
            case "triangle":
                double triangleSide = Double.parseDouble(console.nextLine());
                double triangleHight = Double.parseDouble(console.nextLine());
                area = (triangleSide * triangleHight) / 2;
        }

        System.out.printf("%.3f", area);
    }
}

