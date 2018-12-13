package task3;

public class Shape {
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public void draw() {}
    public void erase() {}
    public void message() {
        System.out.println("Shape message");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " id=" + id;
    }
}
