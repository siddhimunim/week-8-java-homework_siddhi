package homework_week_8;


public class Point {
    int x;
    int y;


    public static void main(String[] args) {
        // call all methods to main method//
        Point first = new Point(6, 5); //2nd//
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());//1stmethod//
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(); //1st constructor//
        System.out.println("distance()= " + point.distance());

    }

    //declare constructor//
    public Point() {

    }

    //declare constructor//
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
       //instance method with no perameter with return//
    public int getX() {
        return x;
    }
    //instance method with no perameter with returntype//
    public int getY() {
        return y;
    }
    //instance method with perameter with returntype//
    public int setX(int x) {
        this.x = x;
        return x;
    }
    //instance method with perameter with return//
    public int setY(int y) {
        this.y = y;
        return y;
    }
    //instance method with no perameter with return//
    public double distance() {
        return distance(0, 0);

    }
    //instance method with perameter with return//
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }


}
