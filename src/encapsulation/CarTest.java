package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        //Setting info for make
        car1.make = "BMW";

        //Getting info of make
        System.out.println(car1.make); //BMW

        //Setting info for year
        car1.setYear(2020);

        //Getting info of  year
        System.out.println();

        /*
        WHOLE IDEA OF ENCAPSULATION = increased security of data
        Getting and setting is method that allows us to assign and retrive information in a diff way
        Encapsulation == is a way to protect data. It takes restricted data and allows us to access it indirectly
        .... we can indirectly manipulate private data with encapsulation.

        Encapsulation? making sure sensitive data is hidden from users, it restricts direct access
        How is Encapsulation achieved? 1.Make instance variables private 2.Provide setters and getter methods
        .......SO private instance variables can be accessed with public methods (getters and setter)

        getter -> used to retrieve (read) data RETURN
        setter -> used to set (write data) mostly VOID
         */

        car1.setPrice(5000, "abcd1234"); //Setting the price, so argument needs arguments to take in this price
        System.out.println(car1.getPrice()); // Getting == just retrieving the set value, as of now, it takes no argument
        //get or set will take an argument if there is a password that protects it
    }
}
