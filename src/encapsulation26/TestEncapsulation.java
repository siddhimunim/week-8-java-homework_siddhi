package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting value of the variables//
        obj.setName("Siddhi");
        obj.setage(21);
        obj.setRollNo(50);
        //displaying value of the variables
        System.out.println("prime's name :"  + obj.getName());
        System.out.println("prime's age :"  + obj.getAge());
        System.out.println("prime's rollNo :"  + obj.getRollNo());
    }
}

