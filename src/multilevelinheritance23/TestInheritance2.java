package multilevelinheritance23;

public class TestInheritance2 {
    public static void main(String[] args) {
       BabyDog d = new BabyDog();       //object created//

        d.weep();                    // call babydog class//
        d.bark();                   // call dog class method//
        d.eat();                     // call animal method//
    }
}
