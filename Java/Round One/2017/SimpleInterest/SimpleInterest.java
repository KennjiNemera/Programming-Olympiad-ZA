package SimpleInterest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class SimpleInterest {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("P = ");
        double p = Double.parseDouble(br.readLine());
        System.out.print("r = ");
        double r = Double.parseDouble(br.readLine());
        System.out.print("t = ");
        double t = Double.parseDouble(br.readLine());

        System.out.println("A = " + df.format(p + (p * (r / 100d) * t)));

    }
}
