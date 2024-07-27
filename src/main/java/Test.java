
import java.util.ArrayList;
import java.util.stream.Stream;


/**
 *
 * @author Anna Matilainen R00239522
 */
public class Test {
    public static void main (String []args){
        //creating product database
        ProductDB database= new ProductDB();
        
        //creating initial products 
        Phone p1=new Phone("Apple", "iPhone 14", 128, "Phone", "Latest model", 799.99);
        Phone p2=new Phone("Apple", "iPhone 14", 256, "Phone", "Latest model", 899.99);
        Phone p3=new Phone("Apple", "iPhone 14", 512, "Phone", "Latest model", 1099.99);
        Phone p4=new Phone("Apple", "iPhone 14 Plus", 128, "Phone", "Latest model", 899.99);
        Phone p5=new Phone("Apple", "iPhone 14 Plus", 256, "Phone", "Latest model", 999.99);
        Phone p6=new Phone("Apple", "iPhone 14 Plus", 512, "Phone", "Latest model", 1199.99);
        Phone p7=new Phone("Apple", "iPhone 13 mini", 128, "Phone", "Latest model",599.99);
        Phone p8=new Phone("Apple", "iPhone 13 mini", 256, "Phone", "Latest model", 699.99);
        Phone p9=new Phone("Apple", "iPhone 13 mini", 512, "Phone", "Latest model", 899.99);
        Phone p10=new Phone("Apple", "iPhone 13", 128,"Phone", "Latest model", 699.99);
        Phone p11=new Phone("Apple", "iPhone 13", 256, "Phone", "Latest model", 799.99);
        Phone p12=new Phone("Apple", "iPhone 13", 512, "Phone", "Latest model", 999.99);
        
        
        TV tv1 = new TV("Sony",139, "LED", true, "TV", "Very cool TV", 1099.99);
        TV tv2=new TV("Samsung", 154, "Plasma", true, "TV", "Very cool TV", 1799.99);
     
        //adding initial products to database
        database.addProduct(p1);
        database.addProduct(p2);
        database.addProduct(p3);
        database.addProduct(p4);
        database.addProduct(p5);
        database.addProduct(p6);
        database.addProduct(p7);
        database.addProduct(p8);
        database.addProduct(p9);
        database.addProduct(p10);
        database.addProduct(p11);
        database.addProduct(p12);
        database.addProduct(tv1);
        database.addProduct(tv2);
        
        //creating a customer
        Customer Mary = new Customer("Mary Poppins", "27 Windy Street");
        
        //creating an order
        Order o=new Order();
        
        //adding products to order
        o.add(p1, 12);
        o.add(p4,1);
        
        //assigning order to customer
        Mary.addOrder(o);
        
        //creating a second order
        Order o1=new Order();
        
        //adding products to second order
        o1.add(p2, 1);
        o1.add(p3, 5);
        
        //assigning order to second customer
        Mary.addOrder(o1);
        
        //creating a list for storing info about multiple customers
        ArrayList<Customer> c=new ArrayList<>();
        
        //adding existing customer to the list
        c.add(Mary);
        
        //creating a list for storing info about multiple orders
        ArrayList<Order> allOrders = new ArrayList<>();
        
        //creating user menu
        char option;
        do{
            System.out.println();            
            System.out.println();
            System.out.println("1. Create a new product (Phone or TV)");
            System.out.println("2. Search for a product by supplying a product ID");
            System.out.println("3. Display all products in the database");
            System.out.println("4. Create a new customer");
            System.out.println("5. Allow a customer to order some products by supplying the productID and quantity for each product");
            System.out.println("6. Display all the orders that a customer has made and all the OrderDetails that are in each order");
            System.out.println("7. Quit");
            System.out.println();
            System.out.println("Enter choice [1-7]");
            
            option = MyScanner.nextChar();
            System.out.println();
        
            switch (option){
                case '1': option1(database);
                break;
                case '2': option2(database);
                break;
                case '3': option3(database);
                break;
                case '4': option4(c);
                break;
                case '5': option5(c, database);
                break;
                case '6': option6(c, allOrders);
                break;
                case '7':System.out.println("Goodbye");
                break;
                default: System.out.println("Invalid entry");
            }
        }
        while (option!='7');
        }
    
        //option to add a new product of selected type to database using user input
        
        static void option1(ProductDB db){
            System.out.println("Adding a product to database\n");
            System.out.println("Enter 'p' if you want to add a phone. Enter 't' if you want to add a TV");
            char pt =MyScanner.nextChar();
        
            switch(pt){
                case 'p':
                    System.out.println("Enter phone's make: ");
                    String makePhone =MyScanner.nextString();
                    System.out.println("Enter phone's model: ");
                    String model =MyScanner.nextString();
                    System.out.println("Enter phone's storage, GB: ");
                    int storage=MyScanner.nextInt();
                    System.out.println("Enter product price: ");
                    double price =MyScanner.nextDouble();
                    System.out.println("Enter product name: ");
                    String name =MyScanner.nextString();
                    System.out.println("Enter product description: ");
                    String description =MyScanner.nextString();
                    Phone newPhone = new Phone(makePhone, model, storage, name, description, price);
                    db.addProduct(newPhone);
                    System.out.println("Phone product created "+newPhone.toString());
                    break;
                case 't': 
                    System.out.println("Enter TV's make: ");
                    String makeTV =MyScanner.nextString();
                    System.out.println("Enter screen size, cm: ");
                    int size =MyScanner.nextInt();
                    System.out.println("Enter screen type (LED, Plasma, LCD): ");
                    String screenType=MyScanner.nextString();
                    System.out.println("Enter true if TV has 3D capability, otherwise enter false: ");
                    boolean has3D =MyScanner.nextBoolean();
                    System.out.println("Enter product name: ");
                    String nameTV=MyScanner.nextString();
                    System.out.println("Enter product description: ");
                    String descriptionTV=MyScanner.nextString();
                    System.out.println("Enter product price: ");
                    double priceTV =MyScanner.nextDouble();
               
                    TV newTV = new TV(makeTV, size, screenType, has3D, nameTV, descriptionTV, priceTV);
                    db.addProduct(newTV);
                    System.out.println("TV product created "+newTV.toString());
                    break;
                default: System.out.println("Invalid entry");
            }            
        }
        
        //option to search for a product in database based on product ID
        
        static void option2(ProductDB db){
            System.out.println("Searching for a product in database\n");
            System.out.println("Enter product ID (1-"+db.productDB.size()+"): ");
            int productID =MyScanner.nextInt();
            while (productID <1 || productID>db.productDB.size()){
                System.out.println("Invalid entry. Enter a number between 1 and "+db.productDB.size());
                productID=MyScanner.nextInt();
            }
            Product result = db.findProduct(productID);           
            System.out.println(result); 
        }
        
        // option to display all products listed in database
        
        static void option3(ProductDB db){
            System.out.println("Displaying all products in the database");
            db.displayAll();            
        }
        
        //option to add a new customer
        
        static void option4(ArrayList<Customer> c){
            System.out.println("Adding new customer\n");
            System.out.println("Enter customer's name: ");
            String newName =MyScanner.nextString();
            System.out.println("Enter customer's address: ");
            String newAddress=MyScanner.nextString();
            Customer newCustomer=new Customer(newName, newAddress);
            c.add(newCustomer);
        }
        
    //option to add orders for a customer, input validation with Regex
        
        static Order option5(ArrayList<Customer> c, ProductDB db){
            System.out.println("Creating an order for a customer\n");
            System.out.println("Choose a customer and enter the corresponding number");

            for (int i=0;i<c.size();i++){
                String nam=c.get(i).getName();
                System.out.println(i+" "+nam);
            }
            
            int choice=MyScanner.nextInt();
            
            while (choice <0 || choice>c.size()-1){
                System.out.println("Invalid entry. Re-enter");
                choice=MyScanner.nextInt();
            }
            
            Customer temp=c.get(choice);
            System.out.println(c.get(choice).getName());
            Order order=new Order();
                 
            while (true) {
                System.out.println("Enter a product id and a quantity. Enter -1 to finish ");
                String line = MyScanner.nextString();
                while (!line.equals("-1") && (!line.matches("[0-9]+[\\s][0-9]+"))){
                    System.out.println("Invalid entry. Enter data in format number-space-number");
                    line=MyScanner.nextString();
                }
              
                int [] split = Stream.of(line.split(" ", 2))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                
                if (split[0]==-1 || split[1]==-1){
                        break;
                    }

                Product p=db.findProduct(split[0]);
               
                if (p==null || split[1]<1){
                    System.out.println("Nothing was ordered");                    
                }
                else {
                        order.add(p, split[1]);                        
                } 
                System.out.println("You ordered: \n"+ order.toString());            
            }
            temp.addOrder(order); 
            return order;            
        }

        // option to display all orders created for a chosen customer, showing the order details 
        
        static void option6(ArrayList<Customer> c, ArrayList<Order> orders){
            System.out.println("Displaying all the orders that a customer has made and all the OrderDetails that are in each order\n");
            System.out.println("Choose a customer and enter the corresponding number");
            for (int i=0;i<c.size();i++){
                String nam=c.get(i).getName();
                System.out.println(i+" "+nam);
            }
            
            int choice=MyScanner.nextInt();
            while (choice <0 || choice>c.size()-1){
                System.out.println("Invalid entry. Re-enter");
                choice=MyScanner.nextInt();
            }
            Customer temp=c.get(choice);
            String tempName =temp.getName();
            System.out.println(tempName);
            System.out.println("\nThe Orders for "+tempName+" are as follows:\n");
            for (int i=0;i<temp.orders.size();i++){
                System.out.println("Order "+(i+1)+"\n");
                Order order1=temp.orders.get(i);
                System.out.println(order1.toString()+"\n");
            }   
        }
}