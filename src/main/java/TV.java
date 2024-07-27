
/**
 *
 * @author Anna Matilainen R00239522
 */
public class TV extends Product{
    private String make;
    private int screenSize;
    private String type;
    private boolean capable3d;
   
    public TV(String make, int screenSize, String type, boolean capable3d, String name, String description, double price) {
        super(name, description, price);
        this.make = make;
        this.screenSize = screenSize;
        this.type = type;
        this.capable3d = capable3d;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCapable3d() {
        return capable3d;
    }

    public void setCapable3d(boolean capable3d) {
        this.capable3d = capable3d;
    }

    @Override
    public String toString() {
        return make + " " + screenSize + " " + type;
    }

    @Override
    public void print() {
        super.print(); 
    }
    
}
