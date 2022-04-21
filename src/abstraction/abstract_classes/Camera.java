package abstraction.abstract_classes;

public interface Camera {
    void takesPhoto(); // all methods in interfaces are public and abstract
   //Interfaces are usually a couple methods... just additional information... 5-7
    //All instance variables in interfaces are public static final by default(constants)
    //no constructors allowed in interface
    //Use an interface when only some objects will use these methods... not abstract class
}
