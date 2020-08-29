import java.util.*;

public class console {
   
   private static StringBuilder output = new StringBuilder();
   private static int count = 0;

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      char[][] letters = {{'A', 'B', 'C', 'D', 'E', 'F'},
                   {'G', 'H', 'I', 'J', 'K', 'L'},
                   {'M', 'N', 'O', 'P', 'Q', 'R'},
                   {'S', 'T', 'U', 'V', 'W', 'X'},
                   {'Y', 'Z', ' ', '-', '.', '%'}};
                   
      String input = scan.nextLine();
      
      int[] current = {0, 0};
      
      for (int i = output.length(); i < input.length(); i++){
         count += getDistance(current, getIndex(letters, input.charAt(i)));
         current = getIndex(letters, input.charAt(i));
         output.append(input.charAt(i));
      }
      
      count += getDistance(current, getIndex(letters, '%'));
      
      System.out.println(count);
   }
   
   private static int[] getIndex(char[][] letters, char c){
      int[] nextChar = new int[2];
      for(int i = 0; i < letters.length; i++){
         for (int j = 0; j < letters[i].length; j++){
            if (letters[i][j] == c){
               nextChar[0] = i;
               nextChar[1] = j;
               return nextChar;
            }
         }
      }
      return null;
   }
   
   private static int getDistance(int[] current, int[] next){
      int counter = 0;
      for (int i = 0; i < current.length; i++){
         counter += (int)(Math.abs(current[i] - next[i]));
      }  
      counter++;
      return counter;
   }  
}