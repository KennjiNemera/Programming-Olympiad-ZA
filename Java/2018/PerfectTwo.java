import java.util.Scanner;

public class PerfectTwo {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      int deficient = 0, perfect = 0, abundant = 0;
      int sum = 0;
      
      for (int i = a; i <= b; i++){
         for (int j = 1; j < i; j++){
            if (i % j == 0){
               sum += j;
            }
         } 
         if (sum == i){
            perfect += 1;
         } else if (sum < i){
            deficient += 1;
         } else if (sum > i) {
            abundant += 1;
         }
         sum = 0;
      }
      
      System.out.println(deficient + " " + perfect + " " + abundant);      
   }
   
}