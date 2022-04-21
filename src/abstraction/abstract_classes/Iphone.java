package abstraction.abstract_classes;

public class Iphone extends Phone implements Camera,Bluetooth{
    /*
    One class can only have ONE parent...One subclass can only extend from ONE
    Superclass , but one class can implement multiple interfaces.
    IS MULTIPLE INHERITANCE POSSIBLE IN JAVA? - YES, but it's only possible with interfaces
     */

    public static final String OS = "IOS";
    public Iphone() {
    }

    public Iphone(String brand, String color, int storage, int price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("iphone calls");
    }

    @Override
    public void ring() {
        System.out.println("iphone rings");
    }

    @Override
    public void text() {
        System.out.println("iphone texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone takes photo");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("iPhone connecting to Bluetooth...");
    }
}
