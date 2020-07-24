package perfect;

import java.util.ArrayList;
import java.util.Scanner;

public class perfect {
    private static int n;
    public static void main(String[] args) {
        System.out.println("What number would you like to test?");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        test(n);
    }

    public static void test(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum){
            System.out.println(n + " is " + "Perfect" );
        } else if (n > sum) {
            System.out.println(n + " is " + "Deficient" );
        } else if (n < sum) {
            System.out.println(n + " is " + "Abundant" );
        }
    }
}
