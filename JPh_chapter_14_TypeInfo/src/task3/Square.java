package task3;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square erase()");
    }

    @Override
    public void message() {
        System.out.println("Square message");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
