package speeding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class speed {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the time(Seconds): ");
        int time = scan.nextInt();

        System.out.println("What was the distance(meters): ");
        int distance = scan.nextInt();

        double t = (double)time /(60 * 60);
        double d = distance / 1000;
        int speed = (int)(d/t);
        System.out.println(speed + "km/h");
    }
}
