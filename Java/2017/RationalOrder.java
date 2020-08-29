import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class RationalOrder {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      double delta = 0.000001;
      HashSet<Double> foundDoubles = new HashSet<>();
      HashSet<String> foundFractions = new HashSet<>();
      
      for (int denom = 1; denom <= n; denom++){
         for (int num = 0; num <= denom; num++){
            double value = (double) num / denom;
            String frac = num + "/" + denom;
            
            if (foundDoubles.contains(value))continue;
            if (foundFractions.contains(frac))continue;
            
            boolean found = false;
            
            for (Double toTest : foundDoubles){
               if(Math.abs(toTest - value) < delta)
               {
                  found = true;
                  break;
               }
            }
            
            if (found) continue;
            
            foundDoubles.add(value);
            foundFractions.add(frac);
         }
      }
      System.out.println(foundFractions);
      System.out.println(foundFractions.size());
   }
}  