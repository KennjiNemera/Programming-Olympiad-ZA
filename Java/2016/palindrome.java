import java.util.Scanner;

public class palindrome {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      boolean isPalindrome = false;
      int count = 0;
      
      do {
         count++;
         int sum = num + getReverse(num);
         if (isPalindrome(sum)){
            System.out.println(count);
            return;
         }
         num = sum;      
      } while (true);
   }
   
   private static int getReverse(int n){
      String reverse = "";
      int temp = 0;
      while (n > 0){
         temp = n % 10;
         reverse += temp;
         n /= 10;
      }
      return Integer.parseInt(reverse);
   }
   
   private static boolean isPalindrome(int sum){
      return sum == getReverse(sum);
   }
}