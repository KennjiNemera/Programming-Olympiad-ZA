import java.util.*;

public class secretcode {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      String replacedString = input.replaceAll(" ",".");
      int length = 5 * Math.round(replacedString.length() / 5) + 5;

      String encoded = "";

      encoded += replacedString;

      for (int i = input.length(); i < length; i++ ){
         encoded += ".";
      }

      char[][] c = new char[length / 5][5];

      for (int i = 0; i < c.length; i++){
         for (int j = 0; j < 5; j++){
            c[i][j] = encoded.charAt(i * 5 + j);
         }
      }

      for (int i = 0; i < 5; i++){
         for (int j = 0; j < c.length; j++){
            System.out.print(c[j][i]);
         }
      }
   }
}