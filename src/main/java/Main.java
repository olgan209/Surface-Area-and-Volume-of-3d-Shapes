import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Shape3dInterface> shapes = new ArrayList<Shape3dInterface>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int shape = rand.nextInt(3);
            switch (shape) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());
            }
        }

        for (Shape3dInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n", shape.volume());
            System.out.println("^~^~^~^~^~^~^~^~^~^~^~^~^~");
        }
    }
}
