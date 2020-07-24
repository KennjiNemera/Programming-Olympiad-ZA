package righttrunk;

import java.util.ArrayList;
import java.util.Scanner;

public class Truncate {
    public static void main(String[] args) {
        System.out.println("What trucatable would you like to call?");
        Scanner scan = new Scanner(System.in);
        int get = scan.nextInt();
        System.out.println(isPrime());
    }

    public static ArrayList<Integer> isPrime(){
        int start = 1;
        int end = 100;
        ArrayList<Integer> primes = new ArrayList<>();

        for (int n = start; n < end; n++){
            boolean prime = true;
            int i = 2;
            while (i <= n / 2){
                if (n % i == 0){
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime){
                primes.add(n);
            }
        }
        IsTrunk(primes);
        return primes;
    }

    public static void IsTrunk(ArrayList<Integer> primes){
        for (int n: primes) {
            boolean isTrunk = true;
            if (n > 10){
                int i = 2;
                while (i > 10){
                    n = n / 10;
                    if (n % i == 0){
                        isTrunk = false;
                        break;
                    }
                    i++;
                }
                if (isTrunk){
                    primes.remove(n);
                }
            }
        }
    }
}
