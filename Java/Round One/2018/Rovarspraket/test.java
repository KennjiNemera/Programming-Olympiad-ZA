package rovarspraket;

public class test {

    public static void main(String[] args) {
        robberSpeak("Jag talar Rövarspråket!");
        robberSpeak("I'm speaking Robber's language!");
        robberSpeak("Tre Kronor är världens bästa ishockeylag.");

    }

    public static void robberSpeak(String str){
        String robberStr = "";

        for(int i=0; i<str.length(); i++){
            if("bcdfghjklmnpqrstvwxyz".contains(str.toLowerCase().charAt(i)+"")){
                robberStr += str.charAt(i) + "o" + str.toLowerCase().charAt(i);
            } else {
                robberStr += str.charAt(i) + "";
            }
        }

        System.out.println(robberStr);

    }

}