package encapsulation;

public class Car {
    //instance variables
    public String make;
    private int year;
    private double price; // require a password
    private boolean isConvertible = true; // I don't want this to be changed- all must be a convert
                                    // I can achieve this by final keyword OR I won't provide a set method just a get method
                //I can provide only get ==  read only they can only get it, not set it
                //I can provide only set  ==  write only, they can write info but cannot read it
    //Providing indirect access to year to set and get info
    public void setYear(int year){  //Set = sets no return
        this.year = year;
    }

    public int getYear(){  //get = always returning something
        return this.year;   //this. is not necessary bc there->
    }                      //is no local variable within this method
                            //intelliJ know which year


//setting the info
    public void setPrice(int price, String adminPassword){ // set is void, not returning anything
        if(adminPassword.equals("abcd1234"))this.price = price; //set will always be void and will require this. bc of local variable within argument
       else throw new RuntimeException("The password entered is incorrect");
    }// non-static == it belongs to the object(:
//retrieving the info
    public double getPrice(){ //get is returning the set value to it is return type
       return price;
    }//non-static == it belongs to the object

}
