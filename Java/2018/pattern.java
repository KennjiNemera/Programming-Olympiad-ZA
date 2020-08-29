import java.util.*;

public class pattern {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] referance = new int[n];
      
      for (int i = 0; i < n; i++){
         referance[i] = scan.nextInt();
      }
      
      ArrayList<Integer> diffs = new ArrayList<>();
      diffs.add(referance[1] - referance[0]);
      
      for (int i = 2; i < n; i++){
         if (Arrays.equals(referance, generateSequence(referance[0], diffs, n))){
            break;
         } else {
            diffs.add(referance[i] - referance[i-1]);
         }
      }
      System.out.println(diffs.toString());
      
   }
   
   private static int[] generateSequence(int start, ArrayList<Integer> diffs, int n){
      int[] array = new int[n];
      int diffpos = 0;
      array[0] = start;
      
      for (int i = 1; i < n; i++){
        array[i] = array[i-1] + diffs.get(diffpos);
        
        if (++diffpos == diffs.size()){
         diffpos = 0;
        }
      }
      return array;
   }
}