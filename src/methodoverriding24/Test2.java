package methodoverriding24;
//creat class to call the methods and object//
public class Test2 {
    public static void main(String[] args) {
        SBI s =new SBI();          // create object//
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest:" + s.getRateOfInterest());  //call methods//
        System.out.println("ICICI Rate of Interest:" + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest:" + a.getRateOfInterest());
    }
}
