package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

        /*
        Create a food object and define below info for it
        taste = delicious
        name = sushi
        isSpicy = true
        isOrganic = true

        First, print the name of the food
        Then, print if the food is organic
        Finally, print the object itself
         */


        Food f1 = new Food();
        f1.name ="sushi";
        f1.taste = "delicious";
        f1.isSpicy = true;
        f1.setOrganic(true);

        System.out.println(f1.name);
        System.out.println(f1.isOrganic());
        System.out.println(f1);


        /*
        Create a vegetable1 object and define below info for it
        taste = good
        name = parsley
        isSpicy = false
        isOrganic = true
        color = green

        First, print the name of the vegetable and color of the vegetable
        Then, print if the vegetable is organic
        Finally, print the object itself
         */

        Vegetable v1 = new Vegetable();
        v1.name = "parsley";
        v1.taste = "good";
        v1.isSpicy = false;
        v1.setOrganic(true);
        v1.color = "green";

        System.out.println("Name = " + v1.name + " & color = " + v1.color);
        System.out.println(v1.isOrganic());
        System.out.println(v1);



        Vegetable v2 = new Vegetable();
        v2.name = "broccoli";
        System.out.println(v2);


        /*
        I have one Food object -> sushi
        I have 2 Vegetable objects -> parsley, broccoli

        Count and print how many elements in the list has a name that has more than 5 characters

        RESULT:
        2
         */

        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(f1);
        allFoods.add(v1);
        allFoods.add(v2);

        int count = 0;
        for (Food allFood : allFoods) {
            if (allFood.name.length() > 5){
                count++;
            }
        }
        System.out.println(count);


    }
}
