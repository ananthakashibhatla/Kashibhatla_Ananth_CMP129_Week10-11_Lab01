// The class must implement Device
public class Laptop implements Device { 
    // Include these private attributes...brand, model, processorType
    private String brand; 
    private String model;
    private String processorType;

    // Create a public Laptop constructor that initializes all three attributes
    public Laptop(String brand, String model, String processorType) {
        this.brand = brand;
        this.model = model;
        this.processorType = processorType;
    }
    // Include getters and setters for brand, model, and processorType
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() { 
        return model;
    }
    public void setModel(String model) { 
        this.model = model;
    }

    public String getProcessorType() { 
        return processorType;
    }
    public void getProcessorType(String processorType) {
        this.processorType = processorType;
    }

    // Create a Override turnOn() method that display's the laptop's information, including its processor type
    @Override 
    public void turnOn() { 
        System.out.println("The " + brand + " " + model + " laptop is starting.");
        System.out.println("Processor: " + processorType);
    }

}
