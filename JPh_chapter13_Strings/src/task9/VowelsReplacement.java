package task9;

public class VowelsReplacement {
    static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        System.out.println(replaceVowels("_"));
    }

    public static String replaceVowels(String replacement) {
        return knights.replaceAll("[AEYUIOaeyuio]", replacement);
    }
}
