package task3;

//In this task hierarchy of Shape types were taken from chapter 8
//task 2 Here we use them only for cast check

public class ShapeCastingTest {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;
        //Circle circle = rhomboid; //We can't cast it in this way cause Circle is not a
        // child or super for Rhomboid
        //Circle circle2 = (Circle) rhomboid; //We can't cast it even in this way
        rhomboid.message();
        shape.message();
    }
}
