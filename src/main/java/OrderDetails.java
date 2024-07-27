
/**
 *
 * @author Anna Matilainen R00239522
 */
public class OrderDetails {
    Product productOrdered;
    int quantity;

    public OrderDetails(Product productOrdered, int quantity) {
        this.productOrdered = productOrdered;
        this.quantity = quantity;
    }

    public Product getProductOrdered() {
        return productOrdered;
    }

    public void setProductOrdered(Product productOrdered) {
        this.productOrdered = productOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    @Override
    public String toString() {
        return this.getProductOrdered() +" "+ this.getQuantity()+"\n";
    }
    
    public void print(){
        System.out.println(toString());
    }
}
    

