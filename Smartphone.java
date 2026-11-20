//The class must implement Device
public class Smartphone implements Device { 
    // Incldue these private attributes
    private String brand; 
    private String model; 
    private double screenSize;
    //Create a public Smartphone constructor intializing all three attributes
    public Smartphone(String brand, String model, double screenSize) {
        this.brand = brand; 
        this.model = model;
        this.screenSize = screenSize;
    }
    // Include getters and setters for brand, model, and screenSize
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

    public double getScreenSize() { 
        return screenSize;
    }
    public void setScreenSize(double screenSize) { 
        this.screenSize = screenSize;
    }

    // Create the Override turnOn(): method 
    @Override 
    public void turnOn() {
        System.out.println("The " + brand + " " + model + " is powering up.");
        System.out.println("Screen size: " + screenSize + " inches");
    }
}

