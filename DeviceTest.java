import java.util.ArrayList;

public class DeviceTest {
    public static void main(String[] args) {
        // Create at least two Smartphone objects
    Device phone1 = new Smartphone("Apple", "iPhone 17", 6.1);
    Device phone2 = new Smartphone("Samsung", "Galaxy S26", 6.7);
    // Create at least two Laptop objects
    Device laptop1 = new Laptop("Dell", "XPS", "Intel Core i7");
    Device laptop2 = new Laptop("Apple", "MacBook Air", "Apple M5");
    // Assign each object to a variable of type Device
    // Add the objects to a list of Device references 
    ArrayList<Device> devices = new ArrayList<>();

    devices.add(phone1);
    devices.add(phone2);
    devices.add(laptop1);
    devices.add(laptop2);
    // Iterate through the list 
    for(Device device : devices) { 
        device.turnOn();
        System.out.println();
    }
    // Call turnOn() for every device
    // Demonstrate that Java executes the method belonging to the actual object type
    }
}
    
