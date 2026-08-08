
package burgerlab.model;

/**
 *
 * @author Dinujaya Tharaka
 */
public class OrderItem {
    
    private String id;
    private String orderId;
    private String itemCode;
    private int qtyOnHand;
    private double unitPrice;

    public OrderItem(String id, String orderId, String itemCode, int qtyOnHand, double unitPrice) {
        this.id = id;
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderItem{");
        sb.append("id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", qtyOnHand=").append(qtyOnHand);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
