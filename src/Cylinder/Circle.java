package Cylinder;
// create class circle//
public class Circle {
    double radius;
    // create constructor//
    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;

        }
    }
   // create method without perameter//
   public double getRadius(){
        return radius;
   }
    // create method without perameter//
   public double getArea(){
       double area = (radius*radius*Math.PI);
        return area ;
   }
}
