
import java.util.ArrayList;


/**
 *
 * @author Anna Matilainen R00239522
 */
public class ProductDB {
    ArrayList <Product> productDB = new ArrayList <>();
    
    public void addProduct (Product product){
        productDB.add(product);
    }

    private int search (int productID){
      for (int i=0;i<productDB.size();i++){
          Product temp = productDB.get(i);
          int tempID =(int)temp.getID();
          if (tempID==productID){
              return i;
          }         
      }    
      return -999;   
    }

    public Product findProduct(int productID){
      int index=search(productID);
      if (index!=-999){
          return (Product)productDB.get(index);
      }
      else return null;
  }
    
    @Override
    public String toString() {
        String s="";
        for (int i=0;i<productDB.size();i++){
            s=s.concat(productDB.get(i).toString()+"\n");
        }
        return s;
    }
    
    public void displayAll(){
        System.out.println(toString());
    }

    
   
}
