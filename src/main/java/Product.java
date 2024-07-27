
/**
 *
 * @author Anna Matilainen R00239522
 */
public abstract class Product {
    private static int counter;
    private int ID;
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        counter++;
        this.ID=counter;
    }

    public int getID() {
        return this.ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getID()+" "+this.getName()+" "+this.getDescription();
    }
    
    public void print(){
        System.out.println(toString());
    }
}
