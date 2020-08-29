import java.util.ArrayList;
import java.util.Scanner;

public class rovarspraket {
    public static void main(String[] args) {
        //get string
        System.out.println("Translate to Rovarspraket: ");
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        charCheck(inputStr);

    }

    private static void charCheck(String inputStr){
        //new String that will be bulit
        String robberStr = "";

        for(int i=0; i<inputStr.length(); i++){
            if("bcdfghjklmnpqrstvwxyz".contains(inputStr.toLowerCase().charAt(i)+"")){
                robberStr += inputStr.charAt(i) + "o" + inputStr.toLowerCase().charAt(i);
            } else {
                robberStr += inputStr.charAt(i) + "";
            }
        }

        System.out.println(robberStr);

    }



    }

