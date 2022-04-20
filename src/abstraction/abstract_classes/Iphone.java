package abstraction.abstract_classes;

public class Iphone extends Phone{

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
}
