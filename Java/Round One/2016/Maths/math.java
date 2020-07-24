package Maths;

import java.util.Scanner;

public class math {
    private static int ans = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The number: ");
        int N = scan.nextInt();

        for (int i = 1; i < N; i++){
            if (N % i == 0){
                ans += i;
            }
        }

        System.out.println("The sum of the factors: " + ans);
    }

}
