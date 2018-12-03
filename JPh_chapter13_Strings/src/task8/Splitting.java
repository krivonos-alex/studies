package task8;

import java.util.Arrays;

public class Splitting {
    static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        System.out.println("Splitting by \"the\"");
        System.out.println(split("the"));
        System.out.println("Splitting by \"you\"");
        System.out.println(split("you"));
    }

    public static String split (String regex) {
        return Arrays.toString(knights.split(regex));
    }
}
