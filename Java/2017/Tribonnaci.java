import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tribonnaci {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Start with: ");
        String startVals[] = br.readLine().split(" ");
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());

        int lastC = Integer.parseInt(startVals[0]),
                lastB = Integer.parseInt(startVals[1]),
                lastA = Integer.parseInt(startVals[2]);

        switch(n)//special cases - not needed but here for completeness
        {
            case 1:
                System.out.println(lastA);
                return;
            case 2:
                System.out.println(lastB);
                return;
            case 3:
                System.out.println(lastC);
                return;
        }

        for(int i = 0; i < n - 3; i++)
        {
            int nextVal = lastA + lastB + lastC;
            lastC = lastB;
            lastB = lastA;
            lastA = nextVal;
        }

        System.out.println(lastA);

    }
}
