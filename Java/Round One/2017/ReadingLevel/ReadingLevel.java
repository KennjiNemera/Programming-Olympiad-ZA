package ReadingLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ReadingLevel {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("enter text: ");
        String input = br.readLine();

        int wordCount = 0;
        int totalLetters = 0;
        boolean wordState = false; //notices when we enter a new word

        for (char c:input.toCharArray()) {
            boolean newState = Character.isLetter(c);
            if (newState) totalLetters++;
            if (newState && !wordState) wordCount ++;
            wordState = newState;
        }

        System.out.println(df.format((double)totalLetters / wordCount));
    }
}
