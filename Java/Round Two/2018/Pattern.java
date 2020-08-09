import java.util.*;

public class Pattern {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      // length of the pattern
      int n = scan.nextInt();
      
      // Lists that hold the pattern & the pattern difference
      List<Integer> list = new ArrayList<Integer>();
      List<Integer> constDif = new ArrayList<Integer>();
      
      // Read the pattern from the console into an array
      for (int i = 0; i < n; i++){
         list.add(scan.nextInt());
      }
      int[] pattern = list.stream().mapToInt(i->i).toArray();
      
      // Check for a constant difference until we find a repetition
      for (int j = 0; j < pattern.length - 2; j++){
         int difference = pattern[j + 1] - pattern[j];
         if (!constDif.contains(difference)){
            constDif.add(difference);
         }
      }
      
      for (int i : constDif){
         System.out.print(i + " ");
      }
   }
}