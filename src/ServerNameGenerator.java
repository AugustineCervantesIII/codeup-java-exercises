
//walkthrough
import java.util.Random;

public class ServerNameGenerator {

        private static String[] adjectives = {
                "funny",
                "pink",
                "groovy",
                "sharp",
                "short",
                "bouncy",
                "black",
                "happy",
                "tall",
                "nice"
        };

        public static String[] noun = {
                "dog",
                "cat",
                "computer",
                "virus",
                "IDE",
                "resume",
                "duck",
                "exterminator",
                "chair",
                "book"
        };

        static Random randomizer = new Random();

        public static String randomElement(String[] words){
            return words[randomizer.nextInt(words.length)];
        }

        public static String serverName(String a, String b){
            return "Your server name is: " + a + "-" + b;
        }

    public static void main(String[] args){

        System.out.println(serverName(randomElement(adjectives),randomElement(noun)));

    }

}
