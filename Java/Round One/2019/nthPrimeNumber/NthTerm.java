package nthPrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class NthTerm {

    public static void main(String[] args) {


        System.out.println(findPrimes(1, 99999));
    }

    private static Long findPrimes(long start, long end){
        System.out.println("What's your index?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        ArrayList<Long> primes = new ArrayList<Long>();

        for (long n = start; n < end; n++) {
            boolean prime = true;
            long i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                primes.add(n);
            }
        }

            return primes.get(num);
        }
}