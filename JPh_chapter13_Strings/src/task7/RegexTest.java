package task7;

import java.util.Formatter;
import java.util.regex.Matcher;

public class RegexTest {
    public static void main(String[] args) {
        String s1 = "Hello Java Fan.";
        String s2 = "Hello Java Fan";
        String s3 = "hello Java Fan.";
        String s4 = "hello Java Fan";
        System.out.println("s1: " + s1.matches("[A-Z].+\\."));
        System.out.println("s2: " + s2.matches("[A-Z].+\\."));
        System.out.println("s3: " + s3.matches("[A-Z].+\\."));
        System.out.println("s4: " + s4.matches("[A-Z].+\\."));
    }
}
