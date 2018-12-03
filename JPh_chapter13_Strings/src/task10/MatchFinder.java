package task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFinder {
    public static void main(String[] args) {
        String inputString = "Java now has regular expressions";
        String[] expressions = {
                "^Java", "\\Breg.*", "n.w\\s+h(a|i)s",
                "s?", "s*", "s+",
                "s{4}", "s{1}.", "s{0,3}"
        };
        System.out.println("Input string: " + inputString);
        for (String s: expressions) {
            findMatch(s, inputString);
        }
    }

    public static void findMatch(String regex, String inputString) {
        Matcher matcher = Pattern.compile(regex).matcher(inputString);
        System.out.println("Regular expression: " + regex);
        System.out.println("Result: " + matcher.find());
    }
}
