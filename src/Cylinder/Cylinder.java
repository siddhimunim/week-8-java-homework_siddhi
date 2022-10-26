package Cylinder;

// in cylinder class call class name with circle//
public class Cylinder extends Circle {
    double height;

    // create constructor//
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }
   // create method without perameter//
    public double getHeight() {
        return height;
    }
    // create method without perameter//
    public double getVolume() {
        double volume = getArea() * this.height;
        return volume;
    }


}
