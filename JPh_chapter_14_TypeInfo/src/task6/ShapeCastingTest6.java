package task6;

import task3.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCastingTest6 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rhomboid());
        shapes.add(new Square());
        shapes.add(new Triangle());
        for (Shape shape: shapes) {
            mark(shape);
        }
        System.out.println(shapes);
    }

    public static void mark(Shape shape) {
        if (shape instanceof Rhomboid) shape.setId(1);
        if (shape instanceof Square) shape.setId(2);
    }
}
