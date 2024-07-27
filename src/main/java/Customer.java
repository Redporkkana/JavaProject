
import java.util.ArrayList;


/**
 *
 * @author Anna Matilainen R00239522
 */
public class Customer {
    private String name;
    private String address;
    ArrayList <Order> orders = new ArrayList<>();
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        
    }
    public void addOrder(Order o){
        orders.add(o);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
