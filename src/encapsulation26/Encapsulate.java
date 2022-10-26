package encapsulation26;
//private variables declared these can only be accessed by public of class//
public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;
    // get method for name to access private variable name//

    public String getName(){
        return name;
    }
    //set method for name to acess private variable name//
    public void setName(String name){
        this.name = name;
    }
    //get method for roll to acess private variable roll no//
    public int getRollNo(){
        return rollNo;
    }
    //set method for roll to access private variable rollno//
    public void setRollNo(int rollNo1){
        this.rollNo = rollNo1;

    }
    //get method for age to access private variable age//
    public int getAge(){
        return age;
    }
    //set method for age to access private variable age//
    public void setage(int age){
        this.age = age;
    }

    }




