package ConstructorOverloading;
// java programme to overload constructors//
public class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor//
    Student5(int i,String n){
        id =i;
        name = n;
    }
    //creating three constructor//
    Student5(int i,String n ,int a){
        id = i;
        name = n;
        age = a;

    } public void display(){
        System.out.println(id + " " + name + " " + age);

            }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111,"Karen");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();

    }

        }





