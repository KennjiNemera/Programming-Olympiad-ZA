import java.util.Scanner;

public class PrimeGen {
   private static int count = 0;
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      checkVal(n);
      System.out.println(count);
   }
   
   private static boolean checkVal(int n){
      
      for (int i = 1; i <= n; i++){
         boolean isTrue = true;
         for(int j = 1; j <= i; j++){
            if (i % j == 0){
               int val = j + i / j;
               if (!isPrime(val)){
                  isTrue = false;
               } 
            }
         }
         count += isTrue ? i : 0;
      }
      return true;
   }
   
   private static boolean isPrime(int n){
      if (n < 2){
         return false;
      }
      int x = 2;
      while (x * x <= n){
         if (n % x == 0){
            return false;
         }
         x++;
      }
      return true;
   }
}