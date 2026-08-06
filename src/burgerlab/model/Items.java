
package burgerlab.model;

/**
 *
 * @author Dinujaya Tharaka
 */
public class Items {
    private String id;
    private String name;
    private String Description;
    private int qty;
    private double unitPrice;

    public Items(String id, String name, String Description, int qty, double unitPrice) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Items{" + "id=" + id + ", name=" + name + ", Description=" + Description + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }
    
    
    
}
