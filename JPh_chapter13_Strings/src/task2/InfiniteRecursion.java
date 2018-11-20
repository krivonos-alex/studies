package task2;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion adress: " + super.toString() /*this*/ + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> recursionList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            recursionList.add(new InfiniteRecursion());
        }
        System.out.println(recursionList);
    }
}
