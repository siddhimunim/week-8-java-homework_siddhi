package carpetcostcalculater;
/*The Carpet Company has asked you to write an application that calculates the price of carpeting for
        rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
        the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
        meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
        would cost $960.*/
public class Floor {
    double width, length;

  // declare constructor with perameter //
    public Floor(double width, double length){
        this.length=length;   //intialize value//
        this.width =width;
        if(width < 0 && length < 0){
            this.width = 0.0;
            this.length = 0.0;
        }else{
            this.width = width;
            this.length= length;
        }
    }
//declare instance method //
    public double getArea(){
        return this.width*this.length;

    }


}
