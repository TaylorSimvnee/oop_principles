package abstraction.abstract_classes;

public class Samsung extends Phone{

    /*
    Must override all methods

    THE ABSTRACT CHILD IMPLEMENTS THE ABSTRACT PARENT
     */

    public static final String OS = "Android";
    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, int price) {
        super(brand, color, storage, price);
    }

    @Override // Override is optional -- the rest are of course  override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
