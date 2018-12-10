package task19;

import task16.TextFile;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameReader {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Input file path");
        printToConsole(scanner.nextLine());
    }

    private static void printToConsole(String fileName) {
        Pattern p = Pattern.compile("[A-Z][a-z]+");
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(fileName)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}
