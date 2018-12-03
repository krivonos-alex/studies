package task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegex {
    static String inputString = "Arline ate eight apples and one orange while Anite hadn't any";

    public static void main(String[] args) {
        String regex = "(&i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Matcher matcher = Pattern.compile(regex).matcher(inputString);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
