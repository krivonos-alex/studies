package task3;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle jimmy = new Turtle("Jimmy", new Formatter(System.err));
        Turtle alex = new Turtle("Alex", new Formatter(outAlias));
        jimmy.move(0,0);
        alex.move(4, 8);
        jimmy.move(2, 5);
        alex.move(7, 3);
        jimmy.move(9, 11);
        alex.move(13, 9);
    }
}
