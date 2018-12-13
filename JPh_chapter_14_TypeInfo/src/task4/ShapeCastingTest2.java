package task4;

import task3.Circle;
import task3.Rhomboid;
import task3.Shape;

//Here we will use instanceof operator

public class ShapeCastingTest2 {
    static Shape shape;

    public static void main(String[] args) {

        Rhomboid rhomboid = new Rhomboid();
        if (rhomboid instanceof Shape) shape = rhomboid;

        rhomboid.message();
        shape.message();
    }
}
