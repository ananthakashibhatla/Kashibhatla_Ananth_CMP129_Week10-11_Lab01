 // Declare Device as an interafce
public interface Device {
    // Create a default method
    default void turnOn() { 
        System.out.println("The device is now on.");
    }        
}

