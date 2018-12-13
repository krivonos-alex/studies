package task3;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase()");
    }

    @Override
    public void message() {
        System.out.println("Circle message");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

