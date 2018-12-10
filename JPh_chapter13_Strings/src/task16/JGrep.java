package task16;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Program arguments: "./src/task16" "\b[Ssct]\w+" "CASE_INSENSITIVE"*/

public class JGrep {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        File controleFile = new File(args[0]);
        if (controleFile.isDirectory()) {
            File[] files = controleFile.listFiles();
            for (File file: files) {
                printToConsole(file.getAbsolutePath(), args[1], args[2]);
            }
        }
    }

    private static void printToConsole(String fileName, String regex) {
        Pattern p = Pattern.compile(regex);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(fileName)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }

    private static void printToConsole(String fileName, String regex, String inputFlag) {
        Pattern p = Pattern.compile(regex, inputFlag(inputFlag));
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(fileName)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }

    public static int inputFlag(String arg) {
        switch (arg) {
            case "UNIX_LINES":
                return Pattern.UNIX_LINES;
            case "CASE_INSENSITIVE":
                return Pattern.CASE_INSENSITIVE;
            case "COMMENTS":
                return Pattern.COMMENTS;
            case "MULTILINE":
                return Pattern.MULTILINE;
            case "LITERAL":
                return Pattern.LITERAL;
            case "DOTALL":
                return Pattern.DOTALL;
            case "UNICODE_CASE":
                return Pattern.UNICODE_CASE;
            case "CANON_EQ":
                return Pattern.CANON_EQ;
            case "UNICODE_CHARACTER_CLASS":
                return Pattern.UNICODE_CHARACTER_CLASS;
            default:
                return 0;
        }
    }
}
