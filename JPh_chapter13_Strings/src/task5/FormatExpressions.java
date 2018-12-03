package task5;

import java.util.Formatter;

public class FormatExpressions {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);

        int d = 20;
        char c = 'z';
        boolean b = false;
        String s = "Hello";
        double f = 15.876;
        double e = f;
        int x = d;
        int h = d;

        System.out.println("int d = " + d);
        formatter.format("d = %9d\n", d);
        System.out.println("char c = " + c);
        formatter.format("c = %15c\n", c);
        System.out.println("boolean b = " + b);
        formatter.format("b = %15.4b\n", b);
        System.out.println("String s = " + s);
        formatter.format("s = %-27.3s justice\n", s);
        System.out.println("double f = " + d);
        formatter.format("f = %-12.2f Hey\n", f);
        System.out.println("double e = " + e);
        formatter.format("e = %26.4e end\n", e);
        System.out.println("int x = " + x);
        formatter.format("x = %12x end\n", x);
        System.out.println("int h = " + h);
        formatter.format("h = %8.1h end\n", h);
    }
}
