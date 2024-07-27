
import java.util.ArrayList;


/**
 *
 * @author Anna Matilainen R00239522
 */
public class Order {
    ArrayList <OrderDetails> order = new ArrayList <>();
    
    public Order() {
    }
    
    public void add (Product productOrd, int quantityOrd){
        order.add(new OrderDetails(productOrd, quantityOrd));
    }
    
    @Override
    public String toString(){
        String s="";
        for (int i=0;i<order.size();i++){
           s=s.concat(order.get(i).getQuantity()+" unit(s) of "+order.get(i).getProductOrdered() + "\n");
        }
        return s;
    }
    
    
}
