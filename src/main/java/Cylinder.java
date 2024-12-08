import java.util.Random;

public class Cylinder implements Shape3dInterface{
    private double radius;
    private double height;

    public Cylinder(){
        Random rand = new Random();
        this.radius = 1 + rand.nextDouble() * 9;
        this.height = 5 + rand.nextDouble() * 15;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder: radius %.2f height %.2f", radius, height);
    }
}
