package abstraction.abstract_classes;

public abstract class Phone {

    //Default constructor
    public Phone(){

    }

    //Create 4 arg constructor

    public Phone(String brand, String color, int storage, int price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    /*
        An abstract class must be declared with an abstract keyword
        It can have both abstract, non-abstract methods and static methods
        It cannot be instantiated (object cannot be created)
        It can have constructors
        It can have final methods which cannot be overridden

        WHY HAVE ABSTRACT CLASSES AND ABSTRACT METHODS?
            -They're meant to be inherited
            -You want to force child classes to provide some functions
            -...Its as if the abstract class makes initial rules, so you force the child classes to override the body

            CAN ABSTRACT CLASS BE FINAL? NO, illegal combination of access modifiers
                THE ABSTRACT CLASS DEFINES THE RULES
     */

    public String brand;
    public String color;
    public int storage;
    public int price;


    //We can define here what every phone should do
    public abstract void call();
    public abstract void ring();
    public abstract void text();
    public abstract boolean isConvertible();

    /*
    CAN ABSTRACT METHOD BE PRIVATE?
            -No, abstract and private cannot be used together.
            private methods can only be used in the same class...
             and we must override child, which will be a new class.

             ABSTRACT KEYWORD CAN NEVER BE USED WITH FINAL, STATIC, OR PRIVATE. THIS WILL CAUSE ERRORS.
     */


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage='" + storage + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
