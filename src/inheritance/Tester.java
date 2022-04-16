package inheritance;

public class Tester extends Person{

    public Tester(){

    }
    public Tester(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void code(){
        System.out.println("Tester codes");
    }

    @Override
    public void eat(){
        System.out.println("Tester eats");
    }

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }
}
/*
Overriding =
    -Method overriding is only in a child class -- inheritance is there
    -Your have a method in the parent class that you are not satisfied
      with its implementation (body), and you would like to change it.
    - The method name , return type and arguments must be the same
    -Body should be different , otherwise there is no point in overriding
    - THE PURPOSE OF OVERRIDING A METHOD : overriding a parent class' method in a child class


    METHOD OVERLOADING
    -In the same class and has nothing to do with inheritance
    - multiple methods in the same class with the same name but changing either number or type of parameters
 */
