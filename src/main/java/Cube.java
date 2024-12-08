import java.util.Random;

public class Cube implements Shape3dInterface{
    private double side;
    public Cube(){
        this.side = 1 + new Random().nextDouble() * 9;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube side=%.2f", side);
    }
}
