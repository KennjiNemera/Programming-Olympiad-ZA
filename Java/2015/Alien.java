import java.util.Scanner;

public class Alien {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long n = scan.nextInt();
      System.out.println(froog(n));      
   }
    
   public static String froog(long n) {
      long i = 1;
      for (i = 1; i < n; i++) {
         long fac = 1;
         for (int j = 1; j <= i; j++){
            fac *= j;
         }
         if (fac > n){
            break;
         }
      }
      String froog = "";
      for (long j = i - 1; j > 0; j--){
         long fac = 1;
         for (int k = 1; k <= j; k++) {
            fac *= k;
         }
         long dig = n / fac;
         n -= dig * fac;
         froog += dig + " ";
         i++;
      }
      return froog;
   }
}