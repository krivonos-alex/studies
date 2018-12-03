package task12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static final String POEM =
            "Twas brilling, and the stilthy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And tho mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jabjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        int count = 0;
        Matcher matcher = Pattern.compile("[a-z]+").matcher(POEM);
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println(count);
    }
}
