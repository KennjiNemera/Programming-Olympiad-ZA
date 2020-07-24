package DigitWord;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DigitWord {

    public static String W;

    public static void main(String[] args) {
        scan();
    }

    private static void scan() {
        Scanner scan = new Scanner(System.in);
        W = scan.nextLine();
        W = W.toUpperCase();
        char[] array = new char[W.length()];
        W.getChars(0, W.length(), array, 0);

        if (W.contains("O") && W.contains("N") & W.contains("E")){
            System.out.println("ONE");
        } else if (W.contains("T") && W.contains("W") && W.contains("O")){
            System.out.println("TWO");
        } else if (W.contains("T") && W.contains("H") && W.contains("R") && W.contains("E")&& W.contains("E")){
            System.out.println("THREE");
        } else if (W.contains("F") && W.contains("O") && W.contains("U") && W.contains("R")) {
            System.out.println("FOUR");
        } else if (W.contains("F") && W.contains("I") && W.contains("V") && W.contains("E")) {
            System.out.println("FIVE");
        } else if (W.contains("S") && W.contains("I") && W.contains("X")){
                System.out.println("SIX");
        } else if (W.contains("S") && W.contains("E") && W.contains("V") && W.contains("E")&& W.contains("N")) {
            System.out.println("SEVEN");
        } else if (W.contains("E") && W.contains("I") && W.contains("G") && W.contains("H")&& W.contains("T")) {
            System.out.println("EIGHT");
        } else if (W.contains("N") && W.contains("I") && W.contains("N") && W.contains("E")) {
            System.out.println("NINE");
        } else
            System.out.println("NONE");
     }
}
