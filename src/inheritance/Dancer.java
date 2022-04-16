package inheritance;

public class Dancer extends Person{
    //Dancer extends from Person

    public Dancer(){

    }

    public Dancer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void dance(){
        System.out.println("Dancer dances");
    }
}
