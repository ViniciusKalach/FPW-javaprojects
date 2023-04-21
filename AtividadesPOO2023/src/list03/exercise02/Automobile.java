package list03.exercise02;

/**
 *
 * @author Vinícius Kalach, RA: 211559
 */
public class Automobile {
    private String brand;
    private String model;
    
    public Automobile(){
        
    }
    
    public Automobile(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String imprimir(){
        return "\nMarca: " + brand   + 
                "\nModel: " + model;
    }
    
}
