import java.util.*;

public class polynacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> poly = new ArrayList<>();

        int m = 0; // initial values
        int n; // index

        String[] temp = scan.nextLine().split(" "); // initial terms

        for (int i = 0; i < temp.length; i++){
            poly.add(Integer.parseInt(temp[i]));
            m++;
        }

        int nth = scan.nextInt(); // index called for

        n = m;

        for (int i = n; i < nth; i++){
            int nextVal = 0;
            for (int j = 1; j <= m; j++){
                nextVal += poly.get(i-j);
            }
            poly.add(i, nextVal);
        }

        System.out.println(poly.get(nth-1));
    }
}
