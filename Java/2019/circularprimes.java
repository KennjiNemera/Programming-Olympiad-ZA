import java.util.Scanner;

public class circularprimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int num = 0;
        int i = 1;

        while (num < n){
            if (isCircular(i)){
                num++;
            }
            i++;
        }
        System.out.println(i - 1);
    }

    private static boolean isPrime(int p){
        if (p < 2){
            return false;
        }
        int x = 2;
        while (x * x <= p){
            if (p % x == 0){
                return false;
            }
            x++;
        }
        return true;
    }

    private static boolean isCircular(int i){
          int length = numberOfDigits(i);
          int powTen = (int) Math.pow(10, length - 1);

          if (!isPrime(i)){
              return false;
          }

          for (int j = 0; j < length; j++){
              int firstDigit = i / powTen;

              int left = ((i * 10) + firstDigit) - (firstDigit * powTen * 10);

              i = left;

              if (!isPrime(i)){
                  return false;
              }
          }
          return true;
    }

    private static int numberOfDigits(int n) {
        int count = 0;
        while (n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
}
