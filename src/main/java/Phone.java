
/**
 *
 * @author Anna Matilainen R00239522
 */
public class Phone extends Product {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage, String name, String description, double price) {
        super(name, description, price);
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return make + " " + model+ " "+ storage +" GB";
    }

    @Override
    public void print() {
        super.print(); 
    }
    
}
