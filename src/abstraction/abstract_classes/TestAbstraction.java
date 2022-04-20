package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);


        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);


        /*
        Print all objects
        Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
         */

        int isConvert = 0;
        int max = 0;
        Phone  mostExpensive = null;
        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.price > max) mostExpensive = phone;
            if(phone.isConvertible()) isConvert++;
        }
        System.out.println(isConvert);
        System.out.println(mostExpensive.getClass().getSimpleName());

    }
}
