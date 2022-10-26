package poolarea;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
       // declare method with no perameter//
    public double getHeight() {
        return height;
    }
      // declare method with no perameter//
    public double getVolume() {

        return getArea() * height;

    }

}
