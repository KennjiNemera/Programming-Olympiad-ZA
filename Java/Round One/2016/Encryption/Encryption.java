package Encryption;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Word? ");
        String word ="";
        word = scan.nextLine();
        System.out.println("N? ");
        int n1 = scan.nextInt();
        int cut = word.length() - n1;
        String first = word.substring(cut).toUpperCase();
        String last = word.substring(0, cut).toUpperCase();
        String newWord = first + last;
        String output = "";
        for (int i = 0; i < newWord.length(); i++){
            int n2 = n1;
            if (newWord.charAt(i) + n2 > 90){
                n2 = n2 - 26;
            }
            output = output + (char)(newWord.charAt(i)+ n2);
        }
        System.out.println("Output: " + output);
    }
}
