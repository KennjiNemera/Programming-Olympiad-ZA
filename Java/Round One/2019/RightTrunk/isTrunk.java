package righttrunk;

import java.util.Scanner;

class GFG {

    static void sieveOfEratosthenes
    (int n, boolean isPrime[])
    {

        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int p=2; p*p<=n; p++)
        {
            if (isPrime[p] == true)
            {
                for (int i = p * 2; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
    }
    static boolean rightTruPrime(int n)
    {
        // Generating primes using Sieve
        boolean isPrime[] = new boolean[n+1];
        sieveOfEratosthenes(n, isPrime);

        while (n != 0)
        {

            if (isPrime[n])
                n = n / 10;
            else
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println("What truncatable index would you like to call?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (rightTruPrime(n))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
