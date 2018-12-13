package task5;

import task3.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCastingTest3 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Rhomboid());
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape shape: shapes) rotate(shape);
    }

    static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            shape.draw();
        } else shape.message();
    }
}

