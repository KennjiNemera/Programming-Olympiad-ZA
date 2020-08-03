import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Roman {

    private static int[] VALUES = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static String[] ROMAN = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = new String[2];
        for (int i = 0; i < 2; i++){
            input[i] = scan.nextLine();
        }
        System.out.println(getRoman(getValue(input)));
    }

    private static int getValue(String[] input){
        int total = 0;
        for (String roman : input){
            if (roman == null || roman.length() == 0) return -1;

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int len = roman.length(), result = map.get(roman.charAt(len - 1));

            for (int i = len - 2; i >= 0; i--){
                if (map.get(roman.charAt(i)) >= map.get(roman.charAt(i+1)))
                    result += map.get(roman.charAt(i));
                else
                    result -= map.get(roman.charAt(i));
            }
            total += result;
        }
        return total;
    }

    private static String getRoman(int num){
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < VALUES.length;i++){
            while (num >= VALUES[i]){
                num -= VALUES[i];
                roman.append(ROMAN[i]);
            }
        }
        return roman.toString();
    }
}
