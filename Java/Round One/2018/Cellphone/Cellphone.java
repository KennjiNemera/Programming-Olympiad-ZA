package Cellphone;

import java.util.Scanner;

public class Cellphone {
    //Declare constants
    public static int daytimeRate = 80;
    public static int eveningRate = 70;
    public static int weekendRate = 50;
    public static int totalCost = 0;

    public static void main(String[] args) {
        //Ask for input values
        System.out.println("How many Daytime Minutes were used?");
        Scanner daytime = new Scanner(System.in);
        int DaytimeUsed = daytime.nextInt();

        System.out.println("How many Evening Minutes were used?");
        Scanner evening  = new Scanner(System.in);
        int EveningUsed = daytime.nextInt();

        System.out.println("How many Weekend Minutes were used?");
        Scanner weekend = new Scanner(System.in);
        int weekendUsed = daytime.nextInt();

        calculate(DaytimeUsed, EveningUsed, weekendUsed);
    }

    //Carry out the calculation
    public static void calculate(int dytm, int evng, int wknd){
        totalCost = (eveningRate * evng) + (weekendRate * wknd);

        if (dytm > 100) {
            totalCost = daytimeRate * dytm;
        }

        System.out.println("PLEASE PAY: " + totalCost + "c");
    }
}
