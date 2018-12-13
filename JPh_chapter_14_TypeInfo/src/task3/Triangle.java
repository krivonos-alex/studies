package task3;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase()");
    }

    @Override
    public void message() {
        System.out.println("Triangle message");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
