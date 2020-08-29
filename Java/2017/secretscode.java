import java.util.Scanner;

public class secretscode {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      int length = (int) ( 5 * (Math.round(input.length() / 5)) + 5);
      char[][] codeArr = new char[length][5];
      
      StringBuilder sb = new StringBuilder();
      sb.append(input);
      
      for (int k = input.length(); k < length; k++){
         sb.append(" ");
      }
      
      sb.toString().replaceAll("\\s", ".");
      
      for (int i = 0; i < length / 5; i++){
         for (int j = 0; j < 5; j++){
            codeArr[i][j] = sb.charAt(i * 5 + j);
         }
      }
      
      StringBuilder enc = new StringBuilder();
      
      for (int l = 0; l < 5; l++){
         for (int m = 0; m < length / 5; m++){
            enc.append(codeArr[m][l]);
         }
      }
      
      System.out.println(enc.toString().replaceAll("\\s", "."));
   }
   
}