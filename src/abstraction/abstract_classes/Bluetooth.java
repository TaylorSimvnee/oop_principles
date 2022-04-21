package abstraction.abstract_classes;

public interface Bluetooth {
    void connectBluetooth();


    //Static method
    public static int getYear(){ //public is greyed because all methods are public by default
        return 2022;
    }

    //Default method (non static method that has body)
     default boolean isConnected(){
        return true;
    }
}
