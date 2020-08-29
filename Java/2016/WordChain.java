import java.util.*;

public class WordChain {

   public static boolean differsOne(String word1, String word2){
      int count = 0;
      if (word1.equals(word2)){
         return false;
      }
      for (int i = 0; i < word1.length(); i++){
         if(word1.charAt(i) != word2.charAt(i)){
            count++;
         }
         if (count > 1){
            return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      String[] words = input.split(" ");
      Arrays.sort(words);
      
      ArrayList chained = new ArrayList();
      int startingPoint = 0;
      boolean done = false;
      chained.add(words[startingPoint]);
      String word1 = words[startingPoint];
      boolean nextWordFound = false;
      
      do {
         for (int j = 0; j < words.length; j++){
            if (differsOne(word1, words[j]) && !chained.contains(words[j])){
               chained.add(words[j]);
               word1 = words[j];
               nextWordFound = true;
               break;
            }
         }
         if (chained.size() == words.length){
            done = true;
         } else {
            if (!nextWordFound && startingPoint != words.length - 1){
               startingPoint++;
               chained.clear();
               word1 = words[startingPoint];
               chained.add(word1);
               nextWordFound = false; 
            }
            if (!nextWordFound && startingPoint == words.length - 1){
               System.out.println("Impossible");
               return;
            }
         }
         nextWordFound = false;
      } while (!done);
      System.out.println();
      for (Object word : chained){
         System.out.print(word + " ");
      }
   }
}