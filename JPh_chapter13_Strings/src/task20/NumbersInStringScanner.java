package task20;

import java.util.Scanner;

public class NumbersInStringScanner {
    Scanner scanner;
    String input;
    int i;
    long l;
    float f;
    double d;

    public NumbersInStringScanner(String input) {
        this.input = input;
        scanner = new Scanner(input);
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner .nextDouble();
    }

    public static void main(String[] args) {
        NumbersInStringScanner inStringScanner = new NumbersInStringScanner("15 200008888777 14.78 192.16");
        System.out.println(inStringScanner);
    }

    @Override
    public String toString() {
        return "NumbersInStringScanner{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                "," +
                '}';
    }
}
