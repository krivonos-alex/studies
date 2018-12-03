package task6;

public class ToStringFormat {
    int i = 9;
    long l = 25_000L;
    float f = 44.29f;
    double d = 24.95;

    @Override
    public String toString() {
        return String.format("ToStringFormat{ i = %d, l = %d, f = %f, d = %f }", i, l, f, d);
    }

    public static void main(String[] args) {
        ToStringFormat toStringFormat = new ToStringFormat();
        System.out.println(toStringFormat);
    }
}
