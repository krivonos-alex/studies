package task15;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) {
        Pattern p;

        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        if (args.length > 2) {
            p = Pattern.compile(args[1], inputFlag(args[2]));
        } else p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
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
